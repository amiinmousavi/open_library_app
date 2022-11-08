package com.example.libraryappmousavi.screens.books

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.libraryappmousavi.R
import com.example.libraryappmousavi.databinding.FragmentBooksBinding

class BooksFragment : Fragment() {
    private lateinit var viewModel: BookViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentBooksBinding>(
            inflater,
            R.layout.fragment_books,
            container,
            false
        )
        viewModel = ViewModelProvider(this).get(BookViewModel::class.java)
        binding.bookViewModel = viewModel

        viewModel.navigateToAuthor.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            if (it) {
                navigateToAuthor()
            }
        })

        return binding.root
    }

    private fun navigateToAuthor() {
        requireView().findNavController().navigate(R.id.action_booksFragment_to_authorsFragment)
        viewModel.btnNavigateToAuthorFinished()
    }
}