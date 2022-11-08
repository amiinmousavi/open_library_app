package com.example.libraryappmousavi.screens.options

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.libraryappmousavi.R
import com.example.libraryappmousavi.databinding.FragmentHelpBinding

class HelpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHelpBinding>(
            inflater,
            R.layout.fragment_help,
            container,
            false
        )
        return binding.root
    }

}