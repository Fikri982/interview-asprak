# Soal 2 - Penentuan Grade Algoritma dan Pemrograman Komputer 1

## Deskripsi

Kamu adalah seorang dosen Mata Kuliah Algoritma dan Pemrograman Komputer 1 dan ingin menentukan grade huruf pada 5 mahasiswa untuk Mata Kuliah tersebut. Contoh aturan untuk menentukan grade:

```
Grade(x) =
    A,   jika 86 <= x <= 100
    AB,  jika 76 <= x <= 85
    B,   jika 66 <= x <= 75
    BC,  jika 61 <= x <= 65
    C,   jika 56 <= x <= 60
    D,   jika 41 <= x <= 55
    E,   jika 0 <= x <= 40
```

Buatlah program yang menghitung dan menampilkan grade dari nilai Algoritma dan Pemrograman Komputer 1 untuk 5 mahasiswa.

## Format Input

- Sebuah array bilangan bulat (`int[]`) berisi nilai 5 mahasiswa, masing-masing bernilai 0–100 (Asumsi nilai mahasiswa tersebut bilangan bulat).

Contoh deklarasi di dalam kode:

```java
int[] nilai = {90, 60, 40, 75, 88};
```

## Format Output

Grade untuk setiap nilai dicetak berurutan sesuai urutan input dengan format per baris:

```
Nilai <nilai> -> Grade <grade>
```

## Contoh

**Input**

```java
int[] nilai = {90, 60, 40, 75, 88};
```

**Output**

```
Nilai 90 -> Grade A
Nilai 60 -> Grade C
Nilai 40 -> Grade E
Nilai 75 -> Grade B
Nilai 88 -> Grade A
```

## Petunjuk

- Buat method `tentukanGrade(int nilai)` yang menerima satu nilai dan mengembalikan `String` (grade-nya).
- Gunakan struktur `if - else if - else` yang berurutan dari kondisi tertinggi ke terendah agar aturan grade tidak tertukar.

## Poin Tambahan (opsional, jika waktu masih cukup)

1. Tambahkan hitungan jumlah mahasiswa yang **lulus** (grade selain "D" dan "E"), tampilkan sebagai baris terakhir: `Total lulus: <jumlah>`.
2. Pisahkan logika cek kelulusan ke dalam method `isLulus(String grade)` yang mengembalikan `boolean`. Ingat bahwa grade bertipe String maka bisa gunakan .equals() untuk membandingkannya dengan "D" dan "E".
