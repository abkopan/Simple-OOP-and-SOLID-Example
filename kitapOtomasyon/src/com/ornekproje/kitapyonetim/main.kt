package com.ornekproje.kitapyonetim

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val library = Library()

    while (true) {
        println("\nKitap Yönetim Sistemi")
        println("1. Kitap Ekle")
        println("2. Kitapları Listele")
        println("3. Kitap Ara")
        println("4. Çıkış")

        print("Seçiminizi yapın (1-4): ")
        when (scanner.nextInt()) {
            1 -> {
                scanner.nextLine()
                print("Kitap Başlığı: ")
                val title = scanner.nextLine()
                print("Yazar Adı: ")
                val authorName = scanner.nextLine()
                print("Yazar Doğum Yılı: ")
                val birthYear = scanner.nextInt()
                print("ISBN: ")
                val isbn = scanner.next()
                print("Yayın Yılı: ")
                val publishedYear = scanner.nextInt()
                print("Kitap Türü (1 - Basılı, 2 - Dijital): ")
                when (scanner.nextInt()) {
                    1 -> {
                        print("Ağırlık (kg): ")
                        val weight = scanner.nextDouble()
                        val book = PrintedBook(title, Author(authorName, birthYear), isbn, publishedYear, weight)
                        library.addBook(book)
                    }
                    2 -> {
                        print("Dosya Boyutu (MB): ")
                        val fileSize = scanner.nextDouble()
                        val book = DigitalBook(title, Author(authorName, birthYear), isbn, publishedYear, fileSize)
                        library.addBook(book)
                    }
                }
            }
            2 -> {
                println("Kütüphanedeki Kitaplar:")
                library.getBooks().forEach { println(it) }
            }
            3 -> {
                print("Aranacak Kitap ISBN: ")
                val isbn = scanner.next()
                val book = library.findBook(isbn)
                if (book != null) {
                    println("Bulunan Kitap: $book")
                } else {
                    println("Kitap bulunamadı.")
                }
            }
            4 -> {
                println("Çıkılıyor...")
                break
            }
            else -> {
                println("Geçersiz seçim, lütfen tekrar deneyin.")
            }
        }
    }

    scanner.close()
}
