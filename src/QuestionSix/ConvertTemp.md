# Soal 6 - Konversi Suhu

## Deskripsi

Konversi suhu dari Celsius ke Fahrenheit dengan bentuk umum:

```
F(C) = (9/5) * C + 32
```

Diberikan sekumpulan data suhu dalam Celsius, konversikan setiap nilainya ke dalam Fahrenheit.

## Format Input

- Sebuah array bilangan bulat (`int[]`) berisi suhu dalam Celsius.

Contoh deklarasi di dalam kode:

```java
int[] celsius = {0, 25, 100};
```

## Format Output

Untuk setiap suhu, cetak satu baris dengan format:

```
<Celsius> Celsius -> <Fahrenheit> Fahrenheit
```

## Contoh

**Input**

```java
int[] celsius = {0, 25, 100};
```

**Output**

```
0 Celsius -> 32.0 Fahrenheit
25 Celsius -> 77.0 Fahrenheit
100 Celsius -> 212.0 Fahrenheit
```

## Petunjuk

- Buat satu method `konversiKeFahrenheit(int celsius)` yang mengembalikan `double`, menggunakan rumus `(celsius * 9.0 / 5) + 32`.
- Perhatikan pembagian `9.0 / 5`, bukan `9 / 5` — kalau ditulis tanpa titik desimal, Java akan membulatkan hasilnya ke bawah menjadi bilangan bulat (pembagian integer), sehingga hasil konversi jadi salah.

## Poin Tambahan (opsional, jika waktu masih cukup)

Hitung juga **rata-rata suhu** dalam Fahrenheit dari seluruh data, dan tampilkan sebagai baris terakhir pada output.
