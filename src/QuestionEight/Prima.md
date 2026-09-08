# Soal 8 - Bilangan Prima Sederhana

## Deskripsi

Sebuah **bilangan prima** adalah bilangan asli lebih besar dari 1 yang hanya memiliki dua faktor pembagi, yaitu 1 dan dirinya sendiri. Contoh: 2, 3, 5, 7, 11 adalah bilangan prima, sedangkan 4, 6, 8, 9 bukan.

Diberikan sebuah bilangan bulat `n`, cari dan tampilkan **semua bilangan prima** dari 2 sampai `n`.

## Format Input

- Sebuah bilangan bulat `n` (n > 1).

Contoh deklarasi di dalam kode:

```java
int n = 20;
```

## Format Output

Program mencetak satu baris berisi seluruh bilangan prima dari 2 sampai `n`, dipisahkan spasi.

## Contoh

**Input**

```java
int n = 20;
```

**Output**

```
2 3 5 7 11 13 17 19
```

## Petunjuk

- Buat satu method `isPrima(int angka)` yang mengembalikan `boolean`, mengecek apakah satu angka tertentu prima atau bukan.
- Di dalam `isPrima`, gunakan perulangan `for` dari 2 sampai `angka-1`, cek apakah ada bilangan di rentang tersebut yang membagi habis `angka` (`angka % i == 0`). Jika ada, berarti bukan prima. Boleh menggunakan `break` begitu ditemukan pembagi.
- Di `main`, buat perulangan `for` dari 2 sampai `n`, panggil `isPrima(...)` untuk setiap angka, dan cetak angka tersebut kalau hasilnya `true`.

## Poin Tambahan (opsional, jika waktu masih cukup)

Tampilkan juga total berapa banyak bilangan prima yang ditemukan dalam rentang tersebut.
