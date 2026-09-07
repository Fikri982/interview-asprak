# Interview Asprak

Kumpulan soal latihan interview asisten praktikum (asprak) berbasis Java. Setiap soal punya folder sendiri berisi deskripsi soal (`.md`) dan solusinya (`.java`).

## Struktur Folder

```
src/
├── App.java                    # entry point default (tidak terkait soal)
├── QuestionOne/
│   ├── Temperature.md          # deskripsi soal
│   ├── Temperature.java        # solusi tanpa poin tambahan
│   └── TemperatureBonus.java   # solusi + poin tambahan
├── QuestionTwo/
│   ├── Grade.md
│   ├── Grade.java
│   └── GradeBonus.java
├── QuestionThree/
│   ├── Presensi.md
│   ├── Presensi.java
│   └── PresensiBonus.java
└── ...                          # QuestionFour, QuestionFive, dst. mengikuti pola yang sama
```

Setiap folder `Question<N>` mengikuti pola: nama package `Question<N>` (huruf pertama kapital, tanpa spasi, angka dieja dalam bahasa Inggris), satu file `.md` berisi soal, satu file `.java` berisi solusi dasar (sesuai spesifikasi utama saja), dan satu file `<NamaSoal>Bonus.java` berisi solusi yang sama ditambah poin tambahan (opsional) dari soal tersebut.

## Daftar Soal

| No | Soal | Deskripsi | Solusi Dasar | Solusi + Bonus |
|----|------|-----------|--------------|-----------------|
| 1 | [Temperature.md](src/QuestionOne/Temperature.md) | Statistik sederhana suhu kota Surabaya (max, min, jangkauan) | [Temperature.java](src/QuestionOne/Temperature.java) | [TemperatureBonus.java](src/QuestionOne/TemperatureBonus.java) |
| 2 | [Grade.md](src/QuestionTwo/Grade.md) | Penentuan grade huruf Algoritma dan Pemrograman Komputer 1 | [Grade.java](src/QuestionTwo/Grade.java) | [GradeBonus.java](src/QuestionTwo/GradeBonus.java) |
| 3 | [Presensi.md](src/QuestionThree/Presensi.md) | Rekap kehadiran mahasiswa Matematika ITS | [Presensi.java](src/QuestionThree/Presensi.java) | [PresensiBonus.java](src/QuestionThree/PresensiBonus.java) |

> Tabel ini akan bertambah baris setiap kali ada soal baru ditambahkan (`QuestionFour`, `QuestionFive`, dst).

## Cara Menjalankan

Compile dan jalankan salah satu soal, contoh untuk Soal 1 (versi dasar):

```bash
cd src
javac QuestionOne/Temperature.java
java QuestionOne.Temperature
```

Atau versi dengan poin tambahan:

```bash
cd src
javac QuestionOne/TemperatureBonus.java
java QuestionOne.TemperatureBonus
```

Ganti `QuestionOne`/`Temperature` sesuai soal yang ingin dijalankan.

## Menambahkan Soal Baru

1. Buat folder baru `src/Question<N>` (mis. `QuestionFour`).
2. Tambahkan file deskripsi `<NamaSoal>.md` berisi soal (bisa mengikuti format soal-soal sebelumnya: Deskripsi, Format Input, Format Output, Contoh, Petunjuk, Poin Tambahan).
3. Tambahkan file solusi dasar `<NamaSoal>.java` dengan `package Question<N>;`, class sesuai nama file, dan implementasi sesuai spesifikasi utama saja (tanpa poin tambahan).
4. Jika soal punya poin tambahan, tambahkan juga file `<NamaSoal>Bonus.java` dengan `package Question<N>;` dan class `<NamaSoal>Bonus` yang mengimplementasikan solusi dasar ditambah poin tambahannya.
5. Tambahkan baris baru ke tabel [Daftar Soal](#daftar-soal) di atas.

## Setup VS Code Java (bawaan template)

- `src`: folder source code
- `lib`: folder dependency (jika ada)
- Compiled output default akan dibuat di folder `bin` jika menggunakan build otomatis VS Code Java Extension Pack.

> Untuk kustomisasi struktur folder, buka `.vscode/settings.json`.

Dependency management bisa dilakukan lewat view `JAVA PROJECTS` di VS Code — detail lebih lanjut [di sini](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
