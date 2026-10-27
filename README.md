# Praktikum Labsi Java — PTA 2026/2027

Kumpulan tugas **Praktikum Laboratorium Sistem Informasi** (Universitas Gunadarma, PTA 2026/2027) untuk mata kuliah **Pemrograman Java**, dibimbing Ketua Asisten Stefy Ruslanda.

| Praktikum | Topik | Konsep Utama |
|---|---|---|
| Minggu ke-1 | Sistem Informasi Hewan | OOP: Encapsulation, Inheritance, Polymorphism |
| Minggu ke-2 | Evaluasi Mahasiswa | Percabangan: if, if-else, if-else if-else, nested if, switch-case |
| Minggu ke-3 | Pola Bangun | Perulangan: for, while, do-while (nested loop) |

**Identitas praktikan:** Dicky Asqaeliany Ibnul Hakim — NPM 20125258 — Kelas 2KB04 — Baris 1

---

## Isi Repo

```text
praktikum_labsi_java/
├── README.md        <- penjelasan repo (file ini)
├── .gitignore       <- *.class dan folder build diabaikan
├── p1/              # Praktikum ke-1 — Sistem Informasi Hewan (OOP)
│   ├── soal.jpeg
│   ├── Hewan.java
│   ├── Kucing.java
│   ├── Sapi.java
│   ├── Main.java
│   ├── result.png
│   ├── screenshot_output.png
│   └── LA_M1_LABSI_JAVA_20125258_DICKY_2KB04.pdf   (laporan akhir M-1)
└── p2/              # Praktikum ke-2 — Evaluasi Mahasiswa (Percabangan)
    ├── Materi_Java_2KB04_p2.pdf
    ├── EvaluasiMahasiswa.java                     (program utama tugas)
    ├── Main.java / MainScanner.java               (latihan materi)
    └── LA_M2_LABSI_JAVA_20125258_DICKY_2KB04.pdf   (laporan akhir M-2)
└── p3/              # Praktikum ke-3 — Pola Bangun (Perulangan)
    ├── soal_LA_m3.jpeg
    ├── soal_LP_m4.jpeg
    ├── PolaBangun.java                            (program utama tugas)
    ├── Main.java                                  (eksperimen nested loop)
    └── LA_M3_LABSI_JAVA_20125258_DICKY_2KB04.pdf   (laporan akhir M-3)
```

---

## P1 — Sistem Informasi Hewan (OOP)

Program Java sederhana bertema Sistem Informasi Hewan dengan menerapkan **Object-Oriented Programming**.

### Konsep OOP yang dipakai

1. **Encapsulation** — atribut `nama` di `Hewan` dibuat `private`, diakses lewat `getNama()` / `setNama()`.
2. **Inheritance** — `Kucing extends Hewan` dan `Sapi extends Hewan`, jadi tidak perlu menulis ulang atribut `nama`.
3. **Polymorphism (Overriding)** — method `bersuara()` yang sama punya perilaku berbeda:
   - `Kucing` -> `Suara: Meong!`
   - `Sapi` -> `Suara: Mooo!`

### Penjelasan file

- **Hewan.java** — parent class: menyimpan `nama` (private) + `getter`/`setter` + `bersuara()` default.
- **Kucing.java / Sapi.java** — subclass: mewarisi `Hewan`, meng-override `bersuara()` dengan suara khas masing-masing.
- **Main.java** — program utama: membuat objek `Kucing` (Milo) dan `Sapi` (Sapi Momo), menampilkan nama + jenis + suara.

### Cara compile & run

```bash
cd p1
javac *.java
java Main
```

### Contoh output

```text
=== Informasi Hewan ===

Nama Hewan: Milo
Jenis Hewan: Kucing
Suara: Meong!

Nama Hewan: Sapi Momo
Jenis Hewan: Sapi
Suara: Mooo!
```

### Alur logika singkat

1. Cetak judul.
2. Buat objek `Kucing`, set nama `Milo`, tampilkan nama + jenis, panggil `bersuara()`.
3. Buat objek `Sapi`, set nama `Sapi Momo`, tampilkan nama + jenis, panggil `bersuara()`.
4. Java otomatis memilih versi `bersuara()` sesuai tipe objek asli (polymorphism).

### Syarat lulus (wajib cek)

- `private String nama` di `Hewan.java`
- Ada `getNama` dan `setNama`
- `Kucing extends Hewan`, `Sapi extends Hewan`
- Ada `@Override` pada `bersuara()` di kedua subclass
- `Main` memakai `setNama`, `getNama`, dan `bersuara()`
- Output sama persis dengan contoh di atas

---

## P2 — Evaluasi Mahasiswa (Percabangan)

Program untuk mengevaluasi hasil ujian mahasiswa. Input dibaca dari keyboard memakai `Scanner`, lalu seluruh struktur kondisi pada materi Pertemuan 2 diterapkan: `if`, `if-else`, `if-else if-else`, `nested if`, dan `switch-case`.

### Konsep percabangan yang dipakai

1. **`if`** — validasi nilai ujian pada rentang 0-100; jika tidak valid, program berhenti dengan pesan "Nilai tidak valid".
2. **`if-else`** — kelulusan dengan nilai minimal 60 (`Lulus` / `Tidak Lulus`).
3. **`if-else if-else`** — predikat nilai: 80-100 `A`, 70-79 `B`, 60-69 `C`, di bawah 60 `D`.
4. **`nested if`** — pemeriksaan kehadiran (minimal 75%) hanya dilakukan jika mahasiswa dinyatakan lulus.
5. **`switch-case`** — menu informasi: pilihan 1 (nama & nilai), 2 (status kelulusan), 3 (predikat), selain itu `Menu tidak tersedia`.

### Penjelasan file

- **EvaluasiMahasiswa.java** — program utama tugas: membaca input (nama, nilai, kehadiran), memvalidasi, menentukan status kelulusan, predikat, kehadiran, lalu menampilkan menu informasi.
- **Main.java / MainScanner.java** — latihan percabangan dari slide materi (predikat nilai dengan if-else if-else, dan switch-case menu kantin).

### Cara compile & run

```bash
cd p2
javac EvaluasiMahasiswa.java
java EvaluasiMahasiswa
```

Program bersifat interaktif, jadi jalankan langsung di terminal (jangan di-pipe) lalu isi sesuai permintaan.

### Contoh output (input: Dicky / 85 / 80 / menu 2)

```text
Nama Mahasiswa      : Dicky
Nilai Ujian (0-100) : 85
Kehadiran (%)       : 80
Nilai valid
Status: Lulus
Kehadiran memenuhi syarat
Predikat: A

=== Menu Informasi ===
1. Nama dan nilai mahasiswa
2. Status kelulusan
3. Predikat nilai
Pilih menu: 2

Informasi: Status kelulusan
Dicky dinyatakan Lulus
```

### Alur logika singkat

1. Baca nama, nilai, dan persentase kehadiran dari keyboard (`Scanner`).
2. Tentukan `hadirMemenuhi` = kehadiran minimal 75%.
3. `if` cek nilai 0-100; jika invalid, cetak pesan dan selesai.
4. `if-else` tentukan status kelulusan, lalu cetak `Status: ...`.
5. `nested if`: jika lulus, cek kehadiran dan cetak hasilnya.
6. `if-else if-else` tentukan predikat, lalu cetak `Predikat: ...`.
7. `switch-case` membaca pilihan menu dan menampilkan informasi sesuai pilihan.
8. Tutup `Scanner` dengan `input.close()`.

### Syarat lulus (wajib cek)

- Ada `import java.util.Scanner` dan `input.close()` di akhir program
- Variabel nama, nilai, dan kehadiran (ketentuan 1)
- `if` untuk validasi rentang 0-100 (ketentuan 2)
- `if-else` untuk kelulusan minimal 60 (ketentuan 3)
- `if-else if-else` untuk predikat A/B/C/D (ketentuan 4)
- `nested if` untuk pemeriksaan kehadiran saat lulus (ketentuan 5)
- `switch-case` untuk menu 1/2/3 + `default` (ketentuan 6)

---

## P3 — Pola Bangun (Perulangan)

Program untuk menampilkan tiga pola bangun menggunakan **tiga jenis perulangan berbeda** sesuai soal: segitiga siku-siku (`for`), segitiga sama sisi (`do-while`), dan persegi (`while`).

### Konsep perulangan yang dipakai

1. **`for` loop** — segitiga siku-siku: angka dicetak sesuai nomor baris (`1`, `2 2`, `3 3 3`, dst). Loop luar mengatur baris, loop dalam mengatur banyaknya angka per baris (`j <= i`).
2. **`do-while` loop** — segitiga sama sisi: piramida `*` rata tengah. Kolom spasi (`kolom <= spasi`) dicetak lebih dulu, baru bintang; jumlah bintang ganjil (`2*baris - 1` = 1, 3, 5, 7, 9). Karena `do-while`, blok dijamin jalan minimal satu kali.
3. **`while` loop** — persegi: setiap baris dicetak dengan angka yang sama (`1 1 1 1 1` s.d. `5 5 5 5 5`). Loop luar = baris, loop dalam = kolom.

### Penjelasan file

- **PolaBangun.java** — program utama tugas: tiga pola dalam satu program, masing-masing memakai jenis loop yang diminta soal.
- **Main.java** — eksperimen nested loop pribadi (for, for-each, while, do-while, break/continue).

### Cara compile & run

```bash
cd p3
javac PolaBangun.java
java PolaBangun
```

### Contoh output (sama dengan contoh di soal)

```text
Segitiga Siku-Siku:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

Segitiga Sama Sisi:
    *
   ***
  *****
 *******
*********

Persegi:
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
```

### Alur logika singkat

1. **Segitiga siku-siku (for):** baris `i` dari 1-5; di dalamnya loop `j` dari 1 sampai `i` mencetak angka `i` dipisah spasi, lalu pindah baris.
2. **Segitiga sama sisi (do-while):** per baris, hitung `spasi = 5 - baris` dan `lebar = spasi + (2*baris - 1)`; loop kolom mencetak spasi dulu, lalu bintang sampai `lebar`, baru pindah baris.
3. **Persegi (while):** baris `b` dari 1-5; loop dalam mencetak angka `b` lima kali dipisah spasi, lalu pindah baris.

### Syarat lulus (wajib cek)

- Segitiga siku-siku memakai `for` dan angka mengikuti nomor baris
- Segitiga sama sisi memakai `do-while` dan pola karakter `*`
- Persegi memakai `while` dan angka sama pada setiap baris
- Output sama dengan contoh output di soal

---

## Laporan Akhir

Laporan sudah final dalam bentuk PDF (sesuai format laboratorium):

- `p1/LA_M1_LABSI_JAVA_20125258_DICKY_2KB04.pdf`
- `p2/LA_M2_LABSI_JAVA_20125258_DICKY_2KB04.pdf`
- `p3/LA_M3_LABSI_JAVA_20125258_DICKY_2KB04.pdf`

Isi laporan: tujuan praktikum, source code, hasil eksekusi (screenshot + output), penjelasan alur logika, dan kesimpulan.

---

## Catatan Teknis

- Semua program berada dalam satu folder per pertemuan, **tanpa `package`**, agar mudah di-compile (`javac *.java`).
- File `*.class` adalah bytecode hasil compile dan **sudah diabaikan** lewat `.gitignore` — cukup di-regenerate dengan `javac`.
- Nama file Java wajib sama persis dengan nama class (case-sensitive).
