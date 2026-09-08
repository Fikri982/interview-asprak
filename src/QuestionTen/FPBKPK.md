# Soal 10 — FPB dan KPK Sekumpulan Pasangan Bilangan

## Deskripsi

**FPB (Faktor Persekutuan Terbesar)** dari dua bilangan adalah bilangan terbesar yang bisa membagi habis kedua bilangan tersebut. **KPK (Kelipatan Persekutuan Terkecil)** adalah bilangan terkecil yang merupakan kelipatan dari kedua bilangan tersebut.

Diberikan sebuah array bilangan bulat dengan panjang genap di mana elemen-elemennya membentuk pasangan berurutan (elemen ke-0 berpasangan dengan ke-1, elemen ke-2 berpasangan dengan ke-3, dan seterusnya). Untuk setiap pasangan, hitung FPB dan KPK-nya.

## Format Input

- Sebuah array bilangan bulat (`int[]`) dengan panjang genap, berisi pasangan-pasangan bilangan positif.

Contoh deklarasi di dalam kode:

```java
int[] data = {12, 18, 20, 30, 7, 14};
```

## Format Output

Untuk setiap pasangan, cetak satu baris dengan format:

```
Pasangan (<a>, <b>) -> FPB: <nilai>, KPK: <nilai>
```

## Contoh

**Input**

```java
int[] data = {12, 18, 20, 30, 7, 14};
```

**Output**

```
Pasangan (12, 18) -> FPB: 6, KPK: 36
Pasangan (20, 30) -> FPB: 10, KPK: 60
Pasangan (7, 14) -> FPB: 7, KPK: 14
```

## Petunjuk

- Buat method `hitungFPB(int a, int b)` yang mengembalikan `int`. Cara paling sederhana: gunakan perulangan `for` (atau `while`) yang mengecek angka dari yang terkecil di antara `a` dan `b` turun sampai 1 dan berhenti begitu menemukan angka yang membagi habis **kedua** bilangan tersebut (`a % i == 0 && b % i == 0`).
- Buat method `hitungKPK(int a, int b, int fpb)` yang mengembalikan `int` menggunakan rumus: `KPK = (a * b) / fpb`. Kedua method ini wajib dibuat terpisah.
- Di `main` buat perulangan `for` yang melangkah 2 index setiap kali (`i = i + 2`), untuk mengambil setiap pasangan `data[i]` dan `data[i+1]`. Panggil `hitungFPB` terlebih dahulu untuk pasangan tersebut baru panggil `hitungKPK` dengan menyertakan hasil FPB itu.

## Poin Tambahan (opsional, jika waktu masih cukup)

Tampilkan juga pasangan mana yang memiliki KPK terbesar di antara semua pasangan yang ada.
