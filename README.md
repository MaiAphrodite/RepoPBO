# RepoPBO

> Archive of PBO coursework: Java OOP exercises from Pertemuan 3 to Pertemuan 11 plus the midterm

[![License](https://img.shields.io/badge/license-MIT-2ea44f?style=flat-square)](LICENSE)
[![Stack](https://img.shields.io/badge/stack-Java%20%7C%20Maven-000?style=flat-square)](#tech-stack)

Every folder here is a standalone exercise from the Pemrograman Berorientasi Objek
course. Each one is a small console program that demonstrates one topic: classes and
constructors, inheritance, abstract classes, interfaces, and composition. There is no
application to install and no shared build; you open the folder you care about and run
its `Main` class.

This is a course archive, not a product. The code is kept as submitted.

## Assignments

| Folder | Topic covered | Layout |
|--------|---------------|--------|
| `PBO_BekerjaDenganJava/MangmaiProject1` | Maven project template that prints student identity to the console | pom at module root |
| `Pertemuan3` | Classes, fields, constructors, and methods: `PrakPBO3` (`Hewan` with nama, umur, `suara`, `info`, `berlari`) and `TugasPBO3` (`Mobil`) | pom at folder root |
| `Pertemuan 4` | Inheritance and access modifiers: `Praktikum4` (`Kendaraan` to `Mobil`), `Tugas_P4` (`Manusia` to `Pekerja`, private and protected fields), plus the `Mai_P4` template | pom at folder root |
| `Pertemuan4` | NetBeans `nbactions.xml` only, no sources | no build |
| `Pertemuan5/MaiPrakPBO_5` | Multilevel inheritance: `Hewan` to `HewanDarat` to `Kucing` and `Anjing` | Maven module |
| `Pertemuan_6/PBO_6` | Abstract class `Produk` with an abstract `hitungDiskon()` overridden per subclass, and `KeranjangBelanja` summing a cart | Maven module |
| `Pertemuan_9/Mai_P9/mavenproject4` | Abstract class with an abstract `suara()` method, implemented by `Kucing` and `Anjing` | Maven module |
| `Pertemuan_10/Mai_P10/PraktikumPBO_10` | Interface `OperasiHitung` with `Penjumlahan` and `Pengurangan`, plus a tax example built on `Pembayaran` | Maven module |
| `Pertemuan_11/PraktikumPBO_11` | Composition: `Perpustakaan` holds `Buku`, `Buku` holds `Pengarang`; `sistemKlub` is an empty scaffold | Maven module |
| `ResponsiUTS/ResponsiUTS-Roekhan_Dani_Maulana` | Midterm exercise: `Pegawai` (Tetap, Kontrak) and `Produk` (Makanan, Elektronik) with inheritance and polymorphism | Maven module |

## Tech stack

| Layer | Choice |
|-------|--------|
| Language | Java 22 (`maven.compiler.source` and `target` in each pom) |
| Build | Maven, one `pom.xml` per exercise, packaging `jar` |
| Editor | NetBeans project metadata (`nbactions.xml`) is kept next to the poms |
| Runtime | Console programs, no GUI and no dependencies |

## Run one exercise

Prerequisites: JDK 22 or newer. Maven is only needed for the command line route; an IDE
can import the folder directly.

```bash
cd Pertemuan_6/PBO_6
mvn -q compile
java -cp target/classes PrakPBO_6.KeranjangBelanja
```

Folders with a space in the name need quoting:

```bash
cd "Pertemuan 4"
mvn -q compile
java -cp target/classes Praktikum4.Main
```

In NetBeans or IntelliJ IDEA, open the folder that contains `pom.xml` as a Maven
project, then run the `Main` class you want from the project tree.

## Notes and limitations

- The poms still carry NetBeans template values for `exec.mainClass`, for example
  `com.lemai.pbo_6.PBO_6`, which does not match the classes in `src`. Run a real class
  explicitly, as in the commands above.
- Folder names are inconsistent: `Pertemuan 4` has a space and holds the sources, while
  `Pertemuan4` holds only a NetBeans actions file.
- Several exercises use the default package or package names such as `Praktikum4` and
  `SoalPBO5` rather than a `com.lemai` prefix, because they were created in different
  IDE sessions.
- Files named `meong`, `.meng`, and `placeholder.txt` are empty markers, not data.
- Maven build output under `target/` is ignored by git and is not part of the archive.
- This is coursework: code favors demonstrating a concept over handling bad input.

## License

MIT, see [LICENSE](LICENSE). Copyright (c) 2026 Mai.
