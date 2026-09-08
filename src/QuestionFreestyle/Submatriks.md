# Soal Freestyle — Submatriks dengan Jumlah Terbesar (2D)

> _Catatan: ini soal freestyle murni buat having fun / uji batas kemampuan kandidat top-tier. JANGAN dipakai sebagai soal reguler_

## Deskripsi

Bayangkan sebuah kertas berpetak berisi angka-angka, lalu kamu diminta menggunting satu potongan persegi panjang darinya sedemikian rupa sehingga jumlah seluruh angka di dalam potongan itu paling besar.

Secara formal: diberikan sebuah matriks (array 2 dimensi) berisi bilangan bulat berukuran `n x m`, yang bisa berisi angka negatif. Tentukan **submatriks** — yaitu blok persegi panjang yang dibentuk oleh baris ke-`r1` sampai `r2` dan kolom ke-`c1` sampai `c2` (dengan `0 ≤ r1 ≤ r2 < n` dan `0 ≤ c1 ≤ c2 < m`) — yang memiliki **jumlah seluruh elemen di dalamnya paling besar**.

Submatriks minimal berukuran 1×1 (boleh cuma 1 sel), dan maksimal bisa mencakup seluruh matriks (kalau seluruh matriks itu yang menghasilkan jumlah terbesar).

## Format Masukan

Sebuah matriks bilangan bulat berukuran `n x m` (array 2 dimensi), boleh berisi angka negatif.

## Format Keluaran

Sebuah bilangan bulat: jumlah terbesar yang bisa didapat dari 1 potongan kotak (submatriks) mana pun di dalam matriks tersebut.

## Contoh 1

**Masukan**

```
matriks = {
  {1, 2, -1, -4, -20},
  {-8, -3, 4, 2, 1},
  {3, 8, 10, 1, 3},
  {-4, -1, 1, 7, -6}
}
```

**Keluaran**

```
29
```

**Penjelasan visual:** potongan kotak terbaik ada di baris index 1 sampai 3, kolom index 1 sampai 3 (ingat, index array dimulai dari 0). Kalau digambar, potongan kotaknya kelihatan begini (ditandai dengan `[ ]`):

```
  1   2  -1  -4  -20
 -8 [-3   4   2] 1
  3 [ 8  10   1] 3
 -4 [-1   1   7] -6
```

Jumlah dari kotak yang ditandai: (-3+4+2) + (8+10+1) + (-1+1+7) = 3 + 19 + 7 = **29**. Ini paling besar dibanding potongan kotak lain yang mungkin kamu coba.

## Contoh 2

**Masukan**

```
matriks = {
  {-5, -4},
  {-3, -2}
}
```

**Keluaran**

```
-2
```

**Penjelasan:** semua angka di matriks ini negatif. Kalau semua negatif, "potongan kotak terbaik" adalah yang paling kecil ukurannya (cuma 1 sel), dan pilih angka yang **paling mendekati nol**, yaitu -2. Kenapa? Karena makin banyak kamu masukin angka negatif ke potonganmu, jumlahnya makin jelek (makin negatif). Jadi mending "gunting" seminimal mungkin.

## Hint

- **Cara paling gampang kepikiran (tapi SANGAT lambat):** coba semua kemungkinan kombinasi baris atas-bawah dan kolom kiri-kanan (4 nested loop), lalu untuk tiap kombinasi hitung jumlah seluruh elemen di dalamnya. Ini **jalan** dan **hasilnya benar**, tapi buat matriks yang besar, ini bakal sangat lambat.

- **Kalau mau cara yang lebih cepat**, coba pikirkan: bagaimana kalau kamu sudah menetapkan batas kolom kiri dan kanan yang mau dipakai (`c1` dan `c2` sudah fix)? Dari situ, masalahnya jadi lebih sederhana — tinggal cari kombinasi baris mana yang menghasilkan jumlah terbesar. Ini mirip dengan masalah klasik "mencari bagian berurutan dari sebuah barisan angka yang jumlahnya paling besar" (kalau familiar, ini dikenal sebagai **algoritma Kadane**), tapi diterapkan pada satu dimensi setelah dimensi lainnya "dipadatkan" jadi satu angka.

- Buat minimal 2 method:
  1. Satu method untuk menyelesaikan bagian "cari jumlah terbesar dari suatu barisan berurutan" di atas.
  2. Satu method utama yang mengatur bagaimana masalah 2D ini dipecah-pecah supaya bisa memanfaatkan method pertama.

## Poin Tambahan (opsional, buat yang menyelesaikan versi optimal dengan cepat)

Selain jumlahnya, minta kandidat juga tampilkan **koordinat submatriks tersebut** (baris awal-akhir dan kolom awal-akhir) yang menghasilkan jumlah terbesar itu.
