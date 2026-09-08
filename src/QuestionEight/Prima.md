# Soal 8 - Bilangan Prima Sederhana

## Deskripsi

Sebuah **bilangan prima** adalah bilangan asli lebih besar dari 1 yang hanya memiliki dua faktor pembagi, yaitu 1 dan dirinya sendiri. Contoh: 2, 3, 5, 7, 11 adalah bilangan prima, sedangkan 4, 6, 8, 9 bukan.

Diberikan sebuah bilangan bulat `n`, cari dan tampilkan **semua bilangan prima** dari 2 sampai `n` beserta keterangan apakah masing-masing prima tersebut **ganjil atau genap**.

## Format Input

- Sebuah bilangan bulat `n` (n > 1).

Contoh deklarasi di dalam kode:

```java
int n = 20;
```

## Format Output

Untuk setiap bilangan prima yang ditemukan, cetak satu baris dengan format:

```
<angka> (<Ganjil/Genap>)
```

## Contoh

**Input**

```java
int n = 20;
```

**Output**

```
2 (Genap)
3 (Ganjil)
5 (Ganjil)
7 (Ganjil)
11 (Ganjil)
13 (Ganjil)
17 (Ganjil)
19 (Ganjil)
```

## Petunjuk

- Buat method `isPrima(int angka)` yang mengembalikan `boolean`, mengecek apakah satu angka tertentu prima atau bukan.
- Buat method kedua `tentukanGanjilGenap(int angka)` yang mengembalikan `String` ("Ganjil" atau "Genap") berdasarkan `angka % 2`. Kedua method ini wajib dibuat terpisah.
- Di dalam `isPrima` gunakan perulangan `for` dari 2 sampai `angka-1`, cek apakah ada bilangan di rentang tersebut yang membagi habis `angka` (`angka % i == 0`). Jika ada berarti bukan prima. Boleh menggunakan `break` begitu ditemukan pembagi.
- Di `main` buat perulangan `for` dari 2 sampai `n`, panggil `isPrima(...)` untuk setiap angka. Kalau prima panggil juga `tentukanGanjilGenap(...)` untuk angka tersebut dan cetak keduanya.
- Perhatikan: 2 adalah satu-satunya bilangan prima yang genap maka semua bilangan prima lainnya pasti ganjil.

## Poin Tambahan (opsional, jika waktu masih cukup)

Tampilkan juga total berapa banyak bilangan prima ganjil dan genap yang ditemukan (dalam bentuk 2 angka terpisah).
