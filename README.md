# README – Program GUI Perhitungan Nilai Mata Kuliah Java AWT

## Deskripsi Program

Program ini merupakan aplikasi GUI sederhana menggunakan Java AWT untuk menghitung nilai akhir beberapa mata kuliah. Pengguna dapat memilih mata kuliah menggunakan radio button, menginput nilai tugas, kuis, UTS, dan UAS, kemudian menghitung nilai akhir berdasarkan rumus masing-masing mata kuliah.

Program menerapkan konsep Object-Oriented Programming (OOP) seperti:

* Abstract Class
* Inheritance
* Polymorphism

Selain itu, hasil seluruh nilai mata kuliah dapat ditampilkan dalam sebuah `TextArea`.

---

# Struktur Class

## 1. MataKuliah.java

Abstract class yang menjadi superclass seluruh mata kuliah.

### Atribut:

* `tugas`
* `kuis`
* `uts`
* `uas`

### Method:

* `hitungNilai()`
  → abstract method untuk menghitung nilai akhir.

---

## 2. Pemlan.java

Subclass dari `MataKuliah`.

### Rumus Nilai:

```text
20% Tugas
20% Kuis
30% UTS
30% UAS
```

---

## 3. ASD.java

Subclass dari `MataKuliah`.

### Rumus Nilai:

```text
10% Tugas
20% Kuis
30% UTS
40% UAS
```

---

## 4. Matkomlan.java

Subclass dari `MataKuliah`.

### Rumus Nilai:

```text
25% Tugas
25% Kuis
25% UTS
25% UAS
```

---

## 5. Probstat.java

Subclass dari `MataKuliah`.

### Rumus Nilai:

```text
15% Tugas
15% Kuis
30% UTS
40% UAS
```

---

## 6.   PraktikumGUI.java

Class utama untuk GUI dan menjalankan program.

### Komponen GUI:

* Label
* TextField
* Button
* Checkbox
* CheckboxGroup
* TextArea

### Fitur:

* Memilih mata kuliah
* Menginput nilai
* Menghitung nilai akhir
* Menampilkan seluruh hasil nilai

---

# Konsep OOP yang Digunakan

## 1. Abstract Class

Class `MataKuliah` digunakan sebagai abstract class agar seluruh mata kuliah memiliki struktur yang sama.

## 2. Inheritance

Class:

* `Pemlan`
* `ASD`
* `Matkomlan`
* `Probstat`

mewarisi class `MataKuliah`.

## 3. Polymorphism

Method:

```java
hitungNilai()
```

diimplementasikan berbeda pada setiap mata kuliah sesuai rumus masing-masing.

---

# Cara Menjalankan Program

## Compile Semua File

```bash
javac *.java
```

## Jalankan Program

```bash
java PraktikumGUI
```

---

# Cara Menggunakan Program

1. Pilih mata kuliah menggunakan radio button.
2. Input nilai tugas, kuis, UTS, dan UAS.
3. Klik tombol `Hitung`.
4. Nilai akhir akan muncul pada TextField hasil.
5. Klik tombol `Tampilkan nilai semua matkul` untuk melihat seluruh hasil nilai.

---

# Contoh Tampilan Program

Program memiliki:

* Form input nilai
* Pilihan mata kuliah
* Tombol hitung
* Area tampilan seluruh nilai

---

# Kesimpulan

Program GUI ini menunjukkan implementasi Java AWT dan konsep OOP dalam pengelolaan nilai mata kuliah. Dengan menggunakan inheritance dan polymorphism, program menjadi lebih modular, fleksibel, dan mudah dikembangkan untuk penambahan mata kuliah baru di masa depan.
