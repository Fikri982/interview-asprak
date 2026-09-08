# Soal 7 - Nilai Mutlak: Selisih Terdekat dari KKM

## Deskripsi

Diberikan sekumpulan nilai ujian siswa dan sebuah nilai KKM (Kriteria Ketuntasan Minimal), tentukan:

1. Nilai siswa mana yang **paling dekat** dengan KKM tersebut (dihitung berdasarkan selisih mutlak terkecil), beserta selisihnya.
2. Berapa banyak siswa yang nilainya sudah mencapai atau melebihi KKM.

## Format Input

- Sebuah array bilangan bulat (`int[]`) berisi nilai ujian siswa.
- Sebuah bilangan bulat `kkm`.

Contoh deklarasi di dalam kode:

```java
int[] nilai = {60, 75, 68, 90};
int kkm = 70;
```

## Format Output

Program mencetak tiga baris:

```
Nilai paling dekat dengan KKM: <nilai>
Selisih: <selisih>
Jumlah siswa mencapai KKM: <jumlah>
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
Selisih: 2
Jumlah siswa mencapai KKM: 2
```

_(Penjelasan: |60-70|=10, |75-70|=5, |68-70|=2, |90-70|=20, jadi 68 paling dekat dengan selisih 2. Yang mencapai/melebihi KKM: 75 dan 90, jadi 2 siswa.)_

## Petunjuk

- Gunakan method bawaan Java `Math.abs(a - b)` untuk menghitung selisih mutlak antara dua bilangan.
- Buat method `hitungSelisihMutlak(int nilai, int kkm)` yang mengembalikan `int` (hasil dari `Math.abs(nilai - kkm)`).
- Buat method `hitungJumlahLulusKKM(int[] nilai, int kkm)` yang mengembalikan `int` (banyaknya nilai yang ≥ kkm). Kedua method ini wajib dibuat terpisah.
- Gunakan perulangan `for` untuk membandingkan selisih setiap nilai, simpan nilai dengan selisih terkecil yang ditemukan sejauh ini.

## Poin Tambahan (opsional, jika waktu masih cukup)

Tampilkan juga nilai tertinggi dan terendah dari keseluruhan data.
