# Soal 1 — Statistik Sederhana: Suhu Kota Surabaya

## Deskripsi

Diberikan data suhu harian kota Surabaya selama beberapa hari, tentukan **suhu tertinggi (maksimum)** dari data tersebut.

Buatlah program yang mencari nilai maksimum tersebut menggunakan sebuah method terpisah (bukan langsung di dalam `main`).

## Format Input

- Sebuah array bilangan bulat (`int[]`) berisi data suhu harian.
- Panjang array tidak ditentukan pasti, tapi asumsikan minimal berisi 1 data.

Contoh deklarasi di dalam kode:

```java
int[] suhu = {24, 30, 18, 27, 33, 21};
```

## Format Output

Program mencetak satu baris:

```
Suhu tertinggi: <nilai>
```

## Contoh

**Input**

```java
int[] suhu = {24, 30, 18, 27, 33, 21};
```

**Output**

```
Suhu tertinggi kota Surabaya: 33
```

## Petunjuk

- Buat satu method `cariMax(int[] arr)` yang mengembalikan nilai maksimum dari array.
- Gunakan perulangan `for`, bandingkan tiap elemen dengan nilai maksimum sementara.

## Poin Tambahan (opsional, jika waktu masih cukup)

1. Cari juga suhu terendah (minimum) dari data tersebut.
2. Hitung jangkauan (selisih maksimum dan minimum) dan tampilkan sebagai baris tambahan.
