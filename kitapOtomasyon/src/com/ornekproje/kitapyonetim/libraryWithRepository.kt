package com.ornekproje.kitapyonetim

class LibraryWithRepository(private val bookRepository: BookRepository) {
    fun addBook(book: Book) {
        bookRepository.save(book)
    }

    fun findBook(isbn: String): Book? {
        return bookRepository.find(isbn)
    }
}