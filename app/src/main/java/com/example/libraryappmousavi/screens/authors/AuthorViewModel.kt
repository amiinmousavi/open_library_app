package com.example.libraryappmousavi.screens.authors

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AuthorViewModel : ViewModel() {
    private val _navigateToBooks = MutableLiveData<Boolean>()
    val navigateToBooks: LiveData<Boolean>
        get() {
            return _navigateToBooks
        }

    init {
        _navigateToBooks.value = false
    }

    override fun onCleared() {
        super.onCleared()
    }

    fun btnNavigateToBooksClicked() {
        _navigateToBooks.value = true
    }

    fun btnNavigateToBooksFinished() {
        _navigateToBooks.value = false
    }

}