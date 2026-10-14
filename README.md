# Praktikum Labsi Java — M1 Sistem Informasi Hewan

Repo untuk tugas **Laporan Akhir M-1**: program Java sederhana bertema Sistem Informasi Hewan dengan konsep **Object-Oriented Programming (OOP)**.

## Isi Repo

```text
praktikum_labsi_java/
├── README.md         <- penjelasan repo (file ini)
└── p1/
    ├── soal.jpeg     <- foto soal asli
    ├── Hewan.java    <- parent class
    ├── Kucing.java   <- subclass Kucing
    ├── Sapi.java     <- subclass Sapi
    └── Main.java     <- program utama
```

## Konsep OOP yang Dipakai

1. **Encapsulation** — atribut `nama` di `Hewan` dibuat `private`, diakses lewat `getNama()` / `setNama()`.
2. **Inheritance** — `Kucing extends Hewan` dan `Sapi extends Hewan`, jadi tidak perlu tulis ulang `nama`.
3. **Polymorphism (Overriding)** — method `bersuara()` yang sama punya perilaku beda:
   - `Kucing` -> `Suara: Meong!`
   - `Sapi` -> `Suara: Mooo!`

## Penjelasan File

- **Hewan.java**: parent class. Simpan `nama`, sediakan `bersuara()` default.
- **Kucing.java / Sapi.java**: anak class. Override `bersuara()` dengan suara khas masing-masing.
- **Main.java**: buat objek `Kucing("Milo")` dan `Sapi("Sapi Momo")`, tampilkan nama + jenis + suara.

## Cara Compile & Run

```bash
cd p1
javac Hewan.java Kucing.java Sapi.java Main.java
java Main
```

## Contoh Output

```text
=== Informasi Hewan ===

Nama Hewan: Milo
Jenis Hewan: Kucing
Suara: Meong!

Nama Hewan: Sapi Momo
Jenis Hewan: Sapi
Suara: Mooo!
```

## Alur Logika Singkat

1. Cetak judul.
2. Buat objek `Kucing`, set nama `Milo`, tampilkan nama + jenis, panggil `bersuara()`.
3. Buat objek `Sapi`, set nama `Sapi Momo`, tampilkan nama + jenis, panggil `bersuara()`.
4. Java otomatis pilih versi `bersuara()` sesuai tipe objek (polymorphism).

## Syarat Lulus (Wajib Cek)

- `private String nama` di `Hewan.java`
- Ada `getNama` dan `setNama`
- `Kucing extends Hewan`, `Sapi extends Hewan`
- Ada `@Override` pada `bersuara()` di kedua subclass
- `Main` memakai `setNama`, `getNama`, dan `bersuara()`
- Output sama persis dengan contoh di atas

## Kebutuhan Laporan Akhir

1. Source code (4 file di `p1/`)
2. Screenshot hasil `java Main`
3. Penjelasan alur logika (lihat bagian di atas)
4. Kesimpulan tentang encapsulation, inheritance, polymorphism
