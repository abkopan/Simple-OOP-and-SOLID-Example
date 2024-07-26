package com.ornekproje.kitapyonetim

class DigitalBook ( // Book sınıfından üretilmiştir ve onun özelliklerini kullanarak kendi özelliklerini ekler burada.(Kalıtım)
    // OCP Book sınıfından kaılıtılarak genişletilme yapılmıştır
    // LSP digitalbook sınıfı book sınıfının yerini alabili
    title: String,
    author: Author,
    isbn: String,
    publishedYear: Int,
    val fileSize: Double
) : Book(title, author, isbn, publishedYear){
    override fun toString(): String {
        return "${super.toString()}, Dosya Boyutu: $fileSize MB"
    }
}