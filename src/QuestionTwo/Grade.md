# Soal 2 - Penentuan Grade Algoritma dan Pemrograman Komputer 1

## Deskripsi

Kamu adalah seorang dosen Mata Kuliah Algoritma dan Pemrograman Komputer 1 dan ingin menentukan grade huruf pada 5 mahasiswa untuk Mata Kuliah tersebut. Aturan penentuan grade adalah sebagai berikut:

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

Buatlah program yang menghitung dan menampilkan grade dari nilai Algoritma dan Pemrograman Komputer 1 untuk 5 mahasiswa, sekaligus menghitung berapa banyak mahasiswa yang dinyatakan **lulus** (grade selain "D" dan "E").

## Format Input

- Sebuah array bilangan bulat (`int[]`) berisi nilai 5 mahasiswa, masing-masing bernilai 0–100 (asumsi nilai mahasiswa tersebut bilangan bulat).

Contoh deklarasi di dalam kode:

```java
int[] nilai = {90, 60, 40, 75, 88};
```

## Format Output

- Grade untuk setiap nilai, dicetak berurutan sesuai urutan input.
- Satu baris terakhir berisi jumlah total mahasiswa yang lulus.

Format cetak per baris:

```
Nilai <nilai> -> Grade <grade>
```

Diakhiri dengan:

```
Total lulus: <jumlah>
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
Total lulus: 4
```

## Petunjuk

- Buat method `tentukanGrade(int nilai)` yang menerima satu nilai dan mengembalikan `String` (grade-nya).
- Buat method `isLulus(String grade)` yang menerima grade dan mengembalikan `boolean` (true jika grade selain "D" dan "E"). Kedua method ini wajib dibuat terpisah.
- Gunakan struktur `if - else if - else` yang berurutan dari kondisi tertinggi ke terendah agar aturan grade tidak tertukar.
- Ingat bahwa grade bertipe `String`, jadi gunakan `.equals()` untuk membandingkannya dengan `"D"` dan `"E"`, bukan operator `==`.

## Poin Tambahan (opsional, jika waktu masih cukup)

Tampilkan juga nilai rata-rata dari seluruh mahasiswa yang lulus saja (grade selain D dan E).
