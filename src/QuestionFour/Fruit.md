# Soal 4 - Buah Buahan

## Deskripsi

Diberikan kumpulan nama buah buahan (disimpan sebagai array) dan satu kata target, tentukan apakah kata target tersebut merupakan anggota dari himpunan tersebut.

## Format Input

- Sebuah array String (`String[]`) yang mewakili nama buah buahan.
- Sebuah String `target` yang akan dicari nama buah dalam array tersebut.

Contoh deklarasi di dalam kode:

```java
String[] himpunanKata = {"apel", "jeruk", "mangga", "jeruk"};
String target = "jeruk";
```

## Format Output

Program mencetak satu baris:

```
<target> merupakan anggota himpunan: <true/false>
```

## Contoh

**Input**

```java
String[] himpunanKata = {"apel", "jeruk", "mangga", "jeruk"};
String target = "jeruk";
```

**Output**

```
jeruk merupakan anggota himpunan: true
```

**Input**

```java
String[] himpunanKata = {"apel", "jeruk", "mangga"};
String target = "durian";
```

**Output**

```
durian merupakan anggota himpunan: false
```

## Petunjuk

- Gunakan .equals() untuk membandingkan dua String, bukan operator ==.
- Buat satu method `isAnggota(String[] himpunan, String target)` yang mengembalikan `boolean`.

## Poin Tambahan (opsional, jika waktu masih cukup)

Tambahkan method `cariPosisi(String[] himpunan, String target)` yang mengembalikan index kemunculan pertama target (atau -1 jika tidak ditemukan), lalu tampilkan sebagai baris kedua pada output.
