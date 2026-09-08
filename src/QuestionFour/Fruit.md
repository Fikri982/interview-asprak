# Soal 4 — Buah-Buahan

## Deskripsi

Diberikan kumpulan nama buah-buahan (disimpan sebagai array) dan satu kata target, tentukan:

1. Apakah kata target tersebut merupakan anggota dari himpunan tersebut (true/false).
2. Posisi (index) pertama kemunculan kata target tersebut. Jika tidak ditemukan maka tampilkan -1.

## Format Input

- Sebuah array String (`String[]`) yang mewakili nama buah-buahan.
- Sebuah String `target` yang akan dicari keberadaannya dalam array tersebut.

Contoh deklarasi di dalam kode:

```java
String[] himpunanBuah = {"apel", "jeruk", "mangga", "jeruk"};
String target = "jeruk";
```

## Format Output

Program mencetak dua baris:

```
<target> merupakan anggota himpunan: <true/false>
Posisi pertama ditemukan: <index / -1>
```

## Contoh

**Input**

```java
String[] himpunanBuah = {"apel", "jeruk", "mangga", "jeruk"};
String target = "jeruk";
```

**Output**

```
jeruk merupakan anggota himpunan: true
Posisi pertama ditemukan: 1
```

**Input**

```java
String[] himpunanBuah = {"apel", "jeruk", "mangga"};
String target = "durian";
```

**Output**

```
durian merupakan anggota himpunan: false
Posisi pertama ditemukan: -1
```

## Petunjuk

- Gunakan `.equals()` untuk membandingkan dua `String`, bukan operator `==`.
- Buat method `isAnggota(String[] himpunan, String target)` yang mengembalikan `boolean`.
- Buat method `cariPosisi(String[] himpunan, String target)` yang mengembalikan `int` (index pertama, atau -1 kalau tidak ada). Kedua method ini wajib dibuat terpisah.
- Boleh menggunakan `break` begitu elemen ditemukan agar program lebih efisien.

## Poin Tambahan (opsional, jika waktu masih cukup)

Hitung juga berapa **total kemunculan** kata target tersebut di dalam himpunan buah (bukan cuma posisi pertamanya).
