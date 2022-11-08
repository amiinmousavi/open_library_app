package com.example.libraryappmousavi.screens.main

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer

import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.libraryappmousavi.R
import com.example.libraryappmousavi.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(
            inflater,
            R.layout.fragment_main,
            container,
            false
        )
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.mainViewModel = viewModel

        viewModel.navigateToLibrary.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            if (it) {
                navigateToLibrary()
            }
        })

        viewModel.navigateToFavorites.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            if (it) {
                navigateToFavorites()
            }
        })

        setHasOptionsMenu(true)

        return binding.root
    }

    private fun navigateToFavorites() {
        requireView().findNavController()
            .navigate(R.id.action_mainFragment_to_favoritesFragment)
        viewModel.btnNavigateToFavoritesFinished()

    }

    private fun navigateToLibrary() {
        requireView().findNavController().navigate(R.id.action_mainFragment_to_libraryActivity)
        viewModel.btnNavigateToLibraryFinished()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item,
            requireView().findNavController()
        ) || super.onOptionsItemSelected(item)
    }
}
