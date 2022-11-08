package com.example.libraryappmousavi.screens.authors

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.libraryappmousavi.R
import com.example.libraryappmousavi.databinding.FragmentAuthorsBinding

class AuthorsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentAuthorsBinding>(
            inflater,
            R.layout.fragment_authors,
            container,
            false
        )
        binding.btnBooks.setOnClickListener{requireView().findNavController().navigate(R.id.action_authorsFragment_to_booksFragment)}
        return binding.root
    }

}