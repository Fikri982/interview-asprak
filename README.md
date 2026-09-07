# Interview Asprak

Kumpulan soal latihan interview asisten praktikum (asprak) berbasis Java. Setiap soal punya folder sendiri berisi deskripsi soal (`.md`) dan solusinya (`.java`).

## Struktur Folder

```
src/
├── App.java              # entry point default (tidak terkait soal)
├── QuestionOne/
│   ├── Temperature.md    # deskripsi soal
│   └── Temperature.java  # solusi
├── QuestionTwo/
│   ├── Grade.md
│   └── Grade.java
├── QuestionThree/
│   ├── Presensi.md
│   └── Presensi.java
└── ...                    # QuestionFour, QuestionFive, dst. mengikuti pola yang sama
```

Setiap folder `Question<N>` mengikuti pola: nama package `Question<N>` (huruf pertama kapital, tanpa spasi, angka dieja dalam bahasa Inggris), satu file `.md` berisi soal, dan satu file `.java` berisi solusi dengan nama class yang sama.

## Daftar Soal

| No | Soal | Deskripsi | Class |
|----|------|-----------|-------|
| 1 | [Temperature.md](src/QuestionOne/Temperature.md) | Statistik sederhana suhu kota Surabaya (max, min, jangkauan) | [Temperature.java](src/QuestionOne/Temperature.java) |
| 2 | [Grade.md](src/QuestionTwo/Grade.md) | Penentuan grade huruf Algoritma dan Pemrograman Komputer 1 | [Grade.java](src/QuestionTwo/Grade.java) |
| 3 | [Presensi.md](src/QuestionThree/Presensi.md) | Rekap kehadiran mahasiswa Matematika ITS | [Presensi.java](src/QuestionThree/Presensi.java) |

> Tabel ini akan bertambah baris setiap kali ada soal baru ditambahkan (`QuestionFour`, `QuestionFive`, dst).

## Cara Menjalankan

Compile dan jalankan salah satu soal, contoh untuk Soal 1:

```bash
cd src
javac QuestionOne/Temperature.java
java QuestionOne.Temperature
```

Ganti `QuestionOne`/`Temperature` sesuai soal yang ingin dijalankan.

## Menambahkan Soal Baru

1. Buat folder baru `src/Question<N>` (mis. `QuestionFour`).
2. Tambahkan file deskripsi `<NamaSoal>.md` berisi soal (bisa mengikuti format soal-soal sebelumnya: Deskripsi, Format Input, Format Output, Contoh, Petunjuk, Poin Tambahan).
3. Tambahkan file solusi `<NamaSoal>.java` dengan `package Question<N>;` dan class sesuai nama file.
4. Tambahkan baris baru ke tabel [Daftar Soal](#daftar-soal) di atas.

## Setup VS Code Java (bawaan template)

- `src`: folder source code
- `lib`: folder dependency (jika ada)
- Compiled output default akan dibuat di folder `bin` jika menggunakan build otomatis VS Code Java Extension Pack.

> Untuk kustomisasi struktur folder, buka `.vscode/settings.json`.

Dependency management bisa dilakukan lewat view `JAVA PROJECTS` di VS Code — detail lebih lanjut [di sini](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
