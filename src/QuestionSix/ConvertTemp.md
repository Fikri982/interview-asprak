# Soal 6 - Konversi Suhu

## Deskripsi

Konversi suhu dari Celsius ke Fahrenheit dengan bentuk umum:

```
F(C) = (9/5) * C + 32
```

Diberikan sekumpulan data suhu dalam Celsius, konversikan setiap nilainya ke dalam Fahrenheit dan simpan hasilnya ke dalam array baru. Selain itu, klasifikasikan setiap suhu (berdasarkan hasil Fahrenheit-nya) ke dalam salah satu kategori berikut:

```
Kategori(F) =
    "Dingin",  jika F < 60
    "Sejuk",   jika 60 <= F < 85
    "Panas",   jika F >= 85
```

Terakhir, hitung juga rata-rata suhu Fahrenheit dari seluruh data.

## Format Input

- Sebuah array bilangan bulat (`int[]`) berisi suhu dalam Celsius.

Contoh deklarasi di dalam kode:

```java
int[] celsius = {0, 25, 35, 40};
```

## Format Output

Untuk setiap suhu, cetak satu baris dengan format:

```
<Celsius> Celsius -> <Fahrenheit> Fahrenheit (<Kategori>)
```

Diakhiri dengan baris rata-rata:

```
Rata-rata Fahrenheit: <nilai>
```

## Contoh

**Input**

```java
int[] celsius = {0, 25, 35, 40};
```

**Output**

```
0 Celsius -> 32.0 Fahrenheit (Dingin)
25 Celsius -> 77.0 Fahrenheit (Sejuk)
35 Celsius -> 95.0 Fahrenheit (Panas)
40 Celsius -> 104.0 Fahrenheit (Panas)
Rata-rata Fahrenheit: 77.0
```

## Petunjuk

- Buat method `konversiKeFahrenheit(int celsius)` yang mengembalikan `double` menggunakan rumus `(celsius * 9.0 / 5) + 32`.
- Buat method kedua `tentukanKategori(double fahrenheit)` yang menerima nilai Fahrenheit dan mengembalikan `String` kategorinya ("Dingin"/"Sejuk"/"Panas") sesuai aturan di atas. Kedua method ini wajib dibuat terpisah.
- Untuk rata-rata cukup jumlahkan setiap hasil `konversiKeFahrenheit(...)` ke sebuah variabel `total` di dalam loop yang sama (tidak perlu array tambahan) lalu bagi `total` dengan banyaknya data setelah loop selesai.
- Perhatikan pembagian `9.0 / 5`, bukan `9 / 5` kalau ditulis tanpa titik desimal maka Java akan membulatkan hasilnya ke bawah menjadi bilangan bulat (pembagian integer) sehingga hasil konversi jadi salah.

## Poin Tambahan (opsional, jika waktu masih cukup)

Hitung juga berapa banyak suhu yang masuk kategori "Panas" dari keseluruhan data.
