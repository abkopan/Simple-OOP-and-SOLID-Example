# Kitap Yönetim Sistemi

Bu proje, Object-Oriented Programming (OOP) ve SOLID prensiplerini gösteren ve bu yapıları daha iyi anlamama yardımcı olacak basit Kotlin tabanlı bir Kitap Yönetim Sistemi'dir. Proje, kitaplar ve yazarları yönetmek için sınıflar içerir ve kütüphaneye kitap ekleme, listeleme ve arama gibi işlevsellikler sağlar.

## Proje Yapısı

Proje aşağıdaki sınıfları içerir:

1. **Library**: Kitap koleksiyonunu yönetir. Kitap ekleme, listeleme ve arama işlemlerini gerçekleştirir.
2. **Book**: Tüm kitap türleri için temel sınıftır. Başlık, yazar, ISBN ve yayın yılı gibi ortak özellikleri içerir.
3. **PrintedBook**: `Book` sınıfından türetilir. Basılı kitapları temsil eder ve ek olarak ağırlık özelliği ekler.
4. **DigitalBook**: `Book` sınıfından türetilir. Dijital kitapları temsil eder ve ek olarak dosya boyutu özelliği ekler.
5. **Author**: Bir kitabın yazarını temsil eder ve yazarın adını ve doğum yılını içerir.
6. **LibraryWithRepository**: Kitap yönetim işlevlerini 'BookRepository' arayüzü ile gerçekleştirir.
7. **BookRepository**:Bu arayüz, kitap verilerini saklamak ve bulmak için gerekli metodları tanımlar.

## OOP Prensipleri

- **Kapsülleme (Encapsulation)**: Her sınıfın özellikleri kapsüllenmiştir ve sadece metodlar aracılığıyla erişilebilir.
- **Kalıtım (Inheritance)**: `PrintedBook` ve `DigitalBook` sınıfları `Book` sınıfından türetilmiştir.
- **Polimorfizm (Polymorphism)**: `toString` gibi metodlar, farklı kitap türleri için farklı şekilde implement edilmiştir.
- **Soyutlama (Abstraction)**: `Book` sınıfı, tüm kitap türleri için ortak bir arayüz sağlar.

## SOLID Prensipleri

- **Single Responsibility Principle (SRP)**: Her sınıfın tek bir sorumluluğu vardır, örneğin `Book` kitap bilgilerini saklar, `Library` kitapları yönetir, ve `Author` yazar bilgilerini temsil eder.
- **Open/Closed Principle (OCP)**: Sistem genişlemeye açıktır ancak mevcut kodun değiştirilmesine kapalıdır. Yeni kitap türleri eklemek için mevcut kodu değiştirmeye gerek yoktur.
- **Liskov Substitution Principle (LSP)**: `PrintedBook` ve `DigitalBook` sınıfları, `Book` sınıfını değiştirmeden kullanabilir.
- **Interface Segregation Principle (ISP)**: `BookRepository` arayüzü, sadece kitap yönetimi için gerekli metodları sağlar.
- **Dependency Inversion Principle (DIP)**: Yüksek seviyeli modüller (`Library`), soyutlamalara (`BookRepository`) bağımlıdır, somut implementasyonlara değil.

## Çalıştırma

Projeyi çalıştırmak için şu adımları izleyin:

1. Repository klonlayın:
2. 
    git clone https://github.com/abkopan/Simple-OOP-and-SOLID-Example.git
   
3. Projeyi IntelliJ IDEA veya tercih ettiğiniz Kotlin IDE'sinde açın.

4. `Main.kt` dosyasına gidin ve çalıştırın.

## Kullanım

Uygulamayı çalıştırdığınızda aşağıdaki menü ile karşılaşacaksınız:

1. **Kitap Ekle**: Kütüphaneye yeni bir kitap ekleyin. Basılı kitap ve dijital kitap arasında seçim yapabilirsiniz.
2. **Kitapları Listele**: Kütüphanedeki tüm kitapları listeleyin.
3. **Kitap Ara**: ISBN numarasına göre kitap arayın.
4. **Çıkış**: Uygulamadan çıkış yapın.

## Örnek

Kitap ekleme ve listeleme işlemi şöyle görünebilir:

Kitap YÖnetim Sistemi:
1. Kitap Ekle
2. Kitapları Listele
3. Kitap Ara
4. Çıkış
Seçiminizi yapın (1-4):  1
Kitap Başlığı : 1984
Yazar Adı: George Orwell
Yazar Doğum Yılı: 1903
ISBN: 1234567890
Yayın Yılı: 1949
Kitap Türü (1: Basılı, 2: Dijital): 1
Ağırlık (kg): 0.5

Kitap Yönetim Sistemi:
1. Kitap Ekle
2. Kitapları Listele
3. Kitap Ara
4. Çıkış
Bir seçenek girin (1/2/3/4): 2
Kütüphanedeki Kitaplar:
1984 - George Orwell, ISBN: 1234567890, Yayın Yılı: 1949, Ağırlık: 0.5 kg
