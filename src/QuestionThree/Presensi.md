# Soal 3 - Rekap Kehadiran Mahasiswa Matematika ITS

## Deskripsi

Diberikan sebuah data kehadiran Mahasiswa Matematika ITS selama satu minggu perkuliahan (Senin sampai Jumat), disimpan sebagai array boolean, di mana:

- `true` berarti mahasiswa hadir pada hari tersebut (datang ke kampus),
- `false` berarti mahasiswa tidak hadir (tidak datang ke kampus).

Dari data tersebut, tentukan dua hal berikut:

1. Banyaknya hari yang bernilai "hadir" (total hari hadir).
2. Apakah proporsi hari hadir terhadap total hari (5 hari) sudah memenuhi syarat minimal **75%**.

## Format Input

- Sebuah array boolean (`boolean[]`) sepanjang 5, dengan urutan index 0 = Senin, 1 = Selasa, ..., 4 = Jumat.

Contoh deklarasi di dalam kode:

```java
boolean[] presensi = {true, true, false, true, true};
```

## Format Output

Program mencetak dua baris:

```
Total hari hadir: <jumlah>
Memenuhi syarat 75%: <true/false>
```

## Contoh

**Input**

```java
boolean[] presensi = {true, true, false, true, true};
```

**Output**

```
Total hari hadir: 4
Memenuhi syarat 75%: true
```

**Input**

```java
boolean[] presensi = {true, true, false, false, true};
```

**Output**

```
Total hari hadir: 3
Memenuhi syarat 75%: false
```

## Petunjuk

- Buat method `hitungTotalHadir(boolean[] presensi)` yang mengembalikan `int`.
- Buat method `hitungPersentase(int totalHadir, int totalHari)` yang mengembalikan `double`. Kedua method ini wajib dibuat terpisah.
- Proporsi kehadiran dihitung dengan: `(totalHadir / (double) totalHari) * 100`. Jangan lupa cast ke `double` agar hasil pembagian tidak dibulatkan ke bawah menjadi 0.

## Poin Tambahan (opsional, jika waktu masih cukup)

Cari **hari pertama** mahasiswa tersebut tidak hadir (tampilkan nama harinya). Jika tidak ada hari yang absen, tampilkan keterangan "Selalu hadir".
