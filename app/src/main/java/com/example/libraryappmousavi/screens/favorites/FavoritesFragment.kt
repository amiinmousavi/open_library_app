package com.example.libraryappmousavi.screens.favorites

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.libraryappmousavi.R
import com.example.libraryappmousavi.databinding.FragmentFavoritesBinding

class FavoritesFragment : Fragment() {

    private lateinit var viewModel: FavoritesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentFavoritesBinding>(
            inflater,
            R.layout.fragment_favorites,
            container,
            false
        )
        viewModel = ViewModelProvider(this).get(FavoritesViewModel::class.java)


        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }

}