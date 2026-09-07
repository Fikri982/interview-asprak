# Soal 3 - Rekap Kehadiran Mahasiswa Matematika ITS

## Deskripsi

Diberikan sebuah data kehadiran Mahasiswa Matematika ITS selama satu minggu perkuliahan (Senin sampai Jumat), disimpan sebagai array boolean, di mana:

- `true` berarti mahasiswa hadir pada hari tersebut (datang ke kampus),
- `false` berarti mahasiswa tidak hadir (tidak datang ke kampus).

Tentukan banyaknya suku (hari) yang bernilai "hadir" (total hari hadir).

## Format Input

- Sebuah array boolean (`boolean[]`) sepanjang 5, dengan urutan index 0 = Senin, 1 = Selasa, ..., 4 = Jumat.

Contoh deklarasi di dalam kode:

```java
boolean[] presensi = {true, true, false, true, true};
```

## Format Output

Program mencetak satu baris:

```
Total hari hadir: <jumlah>
```

## Contoh

**Input**

```java
boolean[] presensi = {true, true, false, true, true};
```

**Output**

```
Total hari hadir: 4
```

**Input**

```java
boolean[] presensi = {true, true, false, false, true};
```

**Output**

```
Total hari hadir: 3
```

## Petunjuk

- Buat satu method `hitungTotalHadir(boolean[] presensi)` yang mengembalikan `int`.
- Gunakan perulangan `for` untuk mengecek setiap elemen array, tambah counter setiap kali nilainya `true`.

## Poin Tambahan (opsional, jika waktu masih cukup)

1. Buat method `hitungPersentase(int totalHadir, int totalHari)` yang mengembalikan `double`, lalu tentukan apakah mahasiswa tersebut memenuhi syarat kehadiran minimal 75%. Ingat, gunakan cast `(double)` agar hasil pembagian tidak dibulatkan ke bawah menjadi 0.
2. Cari **hari pertama** mahasiswa tersebut tidak hadir (tampilkan nama harinya). Jika tidak ada hari yang absen, tampilkan keterangan "Selalu hadir".
