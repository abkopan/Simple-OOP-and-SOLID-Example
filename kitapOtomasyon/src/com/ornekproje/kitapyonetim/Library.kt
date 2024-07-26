package com.ornekproje.kitapyonetim

class Library { // Kitaplarla iligli işlemler için tasarlanan bir sınıf
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun removeBook(isbn: String) {
        books.removeIf { it.isbn == isbn }
    }

    fun findBook(isbn: String): Book? {
        return books.find { it.isbn == isbn }
    }

    fun getBooks(): List<Book> {
        return books.toList()
    }
}