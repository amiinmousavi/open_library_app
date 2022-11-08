package com.example.libraryappmousavi.screens.books

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BookViewModel : ViewModel() {
    private val _navigateToAuthor = MutableLiveData<Boolean>()
    val navigateToAuthor: LiveData<Boolean>
        get() {
            return _navigateToAuthor
        }

    init {
        _navigateToAuthor.value = false
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("BookViewModel", "BookViewModel destroyed")
    }

    fun btnNavigateToAuthorClicked() {
        _navigateToAuthor.value = true
    }

    fun btnNavigateToAuthorFinished() {
        _navigateToAuthor.value = false
    }

}