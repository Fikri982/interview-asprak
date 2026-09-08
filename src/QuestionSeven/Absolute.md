# Soal 7 - Nilai Mutlak: Selisih Terdekat dari KKM

## Deskripsi

**Nilai mutlak (absolute value)** dari suatu bilangan menyatakan jaraknya dari nol, tanpa memandang arah positif atau negatif. Misalnya, nilai mutlak dari -5 dan 5 adalah sama-sama 5.

Diberikan sekumpulan nilai ujian siswa dan sebuah nilai KKM (Kriteria Ketuntasan Minimal), tentukan nilai siswa mana yang **paling dekat** dengan KKM tersebut (dihitung berdasarkan selisih mutlak terkecil).

## Format Input

- Sebuah array bilangan bulat (`int[]`) berisi nilai ujian siswa.
- Sebuah bilangan bulat `kkm`.

Contoh deklarasi di dalam kode:

```java
int[] nilai = {60, 75, 68, 90};
int kkm = 70;
```

## Format Output

Program mencetak satu baris:

```
Nilai paling dekat dengan KKM: <nilai>
```

## Contoh

**Input**

```java
int[] nilai = {60, 75, 68, 90};
int kkm = 70;
```

**Output**

```
Nilai paling dekat dengan KKM: 68
```

_(Karena selisih mutlak 68 dengan 70 adalah 2, yang paling kecil dibanding nilai lainnya: |60-70|=10, |75-70|=5, |90-70|=20)_

## Petunjuk

- Gunakan method bawaan Java `Math.abs(a - b)` untuk menghitung selisih mutlak antara dua bilangan.
- Buat satu method `hitungSelisihMutlak(int nilai, int kkm)` yang mengembalikan `int` (hasil dari `Math.abs(nilai - kkm)`).
- Gunakan perulangan `for` untuk membandingkan selisih setiap nilai, simpan nilai dengan selisih terkecil yang ditemukan sejauh ini.

## Poin Tambahan (opsional, jika waktu masih cukup)

Tampilkan juga selisihnya (baris kedua), dan hitung berapa banyak siswa yang nilainya sudah mencapai atau melebihi KKM.
