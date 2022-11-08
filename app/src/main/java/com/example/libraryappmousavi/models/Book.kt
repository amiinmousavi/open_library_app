package com.example.libraryappmousavi.models

data class Book(
    var isbn: String,
    var author: Author,
    var title: String,
    var number_of_pages: Int
) {

}