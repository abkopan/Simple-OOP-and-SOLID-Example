package com.ornekproje.kitapyonetim

class PrintedBook ( // Book sınıfından üretilmiştir ve onun özelliklerini kullanarak kendi özelliklerini ekler burada.(Kalıtım)
    // OCP Book sınıfından kalıtılarak genişletilme yapılmıştır
    // LSP printedbook sınıfı book sınıfının yerini alabilir
    title: String,
    author: Author,
    isbn: String,
    publishedYear: Int,
    val weight: Double
) : Book(title, author, isbn, publishedYear){
    override fun toString(): String {
        return "${super.toString()}, Weight: $weight kg"
    }
}