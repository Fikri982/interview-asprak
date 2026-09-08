# Soal 9 - Proporsi Bilangan Genap dalam Data

## Deskripsi

**Proporsi** menyatakan seberapa besar bagian dari suatu data yang memenuhi kriteria tertentu dibandingkan dengan keseluruhan data tersebut, biasa dinyatakan dalam bentuk persentase.

Diberikan sekumpulan bilangan bulat, tentukan:

1. Berapa banyak bilangan yang merupakan **bilangan genap** di dalamnya, beserta proporsinya (persentase) terhadap keseluruhan data.
2. Apakah data tersebut **didominasi bilangan genap, bilangan ganjil, atau seimbang** (jumlah genap dan ganjil sama banyak).

## Format Input

- Sebuah array bilangan bulat (`int[]`).

Contoh deklarasi di dalam kode:

```java
int[] data = {3, 4, 7, 8, 10, 11};
```

## Format Output

Program mencetak tiga baris:

```
Jumlah bilangan genap: <jumlah>
Proporsi bilangan genap: <persentase>%
Data didominasi: <Genap/Ganjil/Seimbang>
```

## Contoh

**Input**

```java
int[] data = {3, 4, 7, 8, 10, 11};
```

**Output**

```
Jumlah bilangan genap: 3
Proporsi bilangan genap: 50.0%
Data didominasi: Seimbang
```

_(Penjelasan: dari 6 data, 3 genap dan 3 ganjil, jadi seimbang.)_

**Input**

```java
int[] data = {2, 4, 6, 7, 9};
```

**Output**

```
Jumlah bilangan genap: 3
Proporsi bilangan genap: 60.0%
Data didominasi: Genap
```

## Petunjuk

- Sebuah bilangan disebut genap jika habis dibagi 2 yaitu jika `bilangan % 2 == 0`.
- Buat method `hitungGenap(int[] data)` yang mengembalikan `int` (jumlah bilangan genap).
- Buat method kedua `tentukanDominasi(int jumlahGenap, int jumlahGanjil)`, yang mengembalikan `String` ("Genap"/"Ganjil"/"Seimbang") dengan membandingkan kedua jumlah tersebut. Kedua method ini wajib dibuat terpisah.
- Jumlah ganjil bisa dihitung dengan `totalData - jumlahGenap` (tidak perlu loop lagi).
- Proporsi dihitung dengan: `(jumlahGenap / (double) totalData) * 100`. Jangan lupa cast ke `double` karena kalau tidak maka hasil pembagian akan dibulatkan ke bawah menjadi bilangan bulat (bisa jadi 0).

## Poin Tambahan (opsional, jika waktu masih cukup)

Tampilkan juga bilangan genap terbesar dan terkecil yang ditemukan dalam data tersebut.
