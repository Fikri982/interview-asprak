# Soal 5 - Barisan Aritmatika Sederhana

## Deskripsi

Sebuah **barisan aritmatika** adalah barisan bilangan di mana selisih antara dua suku yang berurutan selalu sama (disebut "beda"). Contohnya: 2, 4, 6, 8, 10 adalah barisan aritmatika dengan beda 2.

Diberikan sebuah barisan bilangan (array), tentukan apakah barisan tersebut merupakan barisan aritmatika atau bukan.

## Format Input

- Sebuah array bilangan bulat (`int[]`) berisi barisan angka, minimal 2 elemen.

Contoh deklarasi di dalam kode:

```java
int[] data = {2, 4, 6, 8, 10};
```

## Format Output

Program mencetak satu baris:

```
Merupakan barisan aritmatika: <true/false>
```

## Contoh

**Input**

```java
int[] data = {2, 4, 6, 8, 10};
```

**Output**

```
Merupakan barisan aritmatika: true
```

**Input**

```java
int[] data = {1, 3, 6, 10};
```

**Output**

```
Merupakan barisan aritmatika: false
```

## Petunjuk

- Hitung dulu selisih (beda) antara suku pertama dan kedua sebagai acuan: `beda = data[1] - data[0]`.
- Buat satu method `isBarisanAritmatika(int[] data)` yang mengembalikan `boolean`. Method ini mengecek apakah selisih antar semua pasangan suku berurutan lainnya sama dengan beda acuan tersebut.
- Gunakan perulangan `for` untuk mengecek setiap pasangan suku secara berurutan.

## Poin Tambahan (opsional, jika waktu masih cukup)

Tampilkan juga nilai beda-nya (jika memang merupakan barisan aritmatika) sebagai baris kedua pada output.
