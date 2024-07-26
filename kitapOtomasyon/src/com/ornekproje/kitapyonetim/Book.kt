package com.ornekproje.kitapyonetim

open class Book( // Temel sınıf burada kitapların özellikleri yer alıyor. Ayrıca bu sınıf sadece kitap bilgilerini tutarak SRP özelliği taşır
    val title: String,
    val author: Author,
    val isbn: String,
    val publishedYear: Int
){
    override fun toString(): String {
        return "$title by ${author.name}, ISBN: $isbn, Yayımlanma Yılı: $publishedYear"
    }
}