# Soal 1 - Statistik Sederhana: Suhu Kota Surabaya

## Deskripsi

Diberikan data suhu harian kota Surabaya selama beberapa hari, tentukan:

1. Suhu tertinggi (maksimum)
2. Suhu terendah (minimum)
3. Jangkauan (selisih antara maksimum dan minimum)

Buatlah program yang mencari nilai maksimum dan minimum tersebut menggunakan **method terpisah** (bukan langsung di dalam `main`).

## Format Input

- Sebuah array bilangan bulat (`int[]`) berisi data suhu harian kota Surabaya.
- Panjang array tidak ditentukan pasti, tapi asumsikan minimal berisi 1 data.

Contoh deklarasi di dalam kode:

```java
int[] suhu = {24, 30, 18, 27, 33, 21};
```

## Format Output

Program mencetak tiga baris:

```
Suhu tertinggi kota Surabaya: <nilai>
Suhu terendah kota Surabaya: <nilai>
Jangkauan: <nilai>
```

## Contoh

**Input**

```java
int[] suhu = {24, 30, 18, 27, 33, 21};
```

**Output**

```
Suhu tertinggi kota Surabaya: 33
Suhu terendah kota Surabaya: 18
Jangkauan: 15
```

## Petunjuk

- Buat method `cariMax(int[] arr)` dan `cariMin(int[] arr)`, masing-masing mengembalikan nilai `int`. Kedua method ini wajib dibuat terpisah.
- Jangkauan dihitung setelah kedua nilai tersebut didapat: `jangkauan = maksimum - minimum`.

## Poin Tambahan (opsional, jika waktu masih cukup)

Hitung juga rata-rata (mean) suhu kota Surabaya dari data tersebut, dan tampilkan sebagai baris keempat pada output.
