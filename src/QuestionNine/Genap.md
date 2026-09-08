# Soal 9 - Proporsi Bilangan Genap dalam Data

## Deskripsi

Diberikan sekumpulan bilangan bulat, tentukan:

1. Berapa banyak bilangan yang merupakan **bilangan genap** di dalamnya.
2. Berapa **proporsi** bilangan genap tersebut terhadap keseluruhan data dalam bentuk persentase.

## Format Input

- Sebuah array bilangan bulat (`int[]`).

Contoh deklarasi di dalam kode:

```java
int[] data = {3, 4, 7, 8, 10, 11};
```

## Format Output

Program mencetak dua baris:

```
Jumlah bilangan genap: <jumlah>
Proporsi bilangan genap: <persentase>%
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
```

## Petunjuk

- Sebuah bilangan disebut genap jika habis dibagi 2, yaitu jika `bilangan % 2 == 0`.
- Buat satu method `hitungGenap(int[] data)` yang mengembalikan `int` (jumlah bilangan genap).
- Gunakan perulangan `for` untuk mengecek setiap elemen array, tambahkan counter setiap kali menemukan bilangan genap.
- Proporsi dihitung dengan: `(jumlahGenap / (double) totalData) * 100`. Jangan lupa cast ke `double`, karena kalau tidak, hasil pembagian akan dibulatkan ke bawah menjadi bilangan bulat (bisa jadi 0).

## Poin Tambahan (opsional, jika waktu masih cukup)

Tampilkan juga bilangan genap terbesar dan terkecil yang ditemukan dalam data tersebut.
