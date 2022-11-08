package com.example.libraryappmousavi.screens.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _navigateToFavorites = MutableLiveData<Boolean>()
    val navigateToFavorites: LiveData<Boolean>
        get() {
            return _navigateToFavorites
        }

    init {
        _navigateToFavorites.value = false
    }

    private val _navigateToLibrary = MutableLiveData<Boolean>()
    val navigateToLibrary: LiveData<Boolean>
        get() {
            return _navigateToLibrary
        }

    init {
        _navigateToLibrary.value = false
    }

    override fun onCleared() {
        super.onCleared()
    }

    fun btnNavigateToFavoritesClicked() {
        _navigateToFavorites.value = true
    }

    fun btnNavigateToFavoritesFinished() {
        _navigateToFavorites.value = false
    }

    fun btnNavigateToLibraryClicked() {
        _navigateToLibrary.value = true
    }

    fun btnNavigateToLibraryFinished() {
        _navigateToLibrary.value = false
    }

}