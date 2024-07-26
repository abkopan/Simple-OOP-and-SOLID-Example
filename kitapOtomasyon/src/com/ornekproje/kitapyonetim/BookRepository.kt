package com.ornekproje.kitapyonetim

interface BookRepository { // Bu sınıf sadece ihtyaç olduğunda kullanıcılara bir arayüz sunar ISP
    fun save(book: Book)
    fun find(isbn: String): Book?
}