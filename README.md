# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data ayam broiler menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa ID dan data ayam broiler, dan memberikan output berupa informasi detail dari data tersebut seperti berat, umur, pakan, dan status panen.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Ayam`, `AyamBroiler`, dan `AyamAfkir` adalah contoh dari class.
```bash

public class Ayam {
    ...
}

public class AyamBroiler extends Ayam {
    ...
}

public class AyamAfkir extends Ayam {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarBroiler[i] = new AyamBroiler(id, berat, umur, pakan);` adalah contoh pembuatan object.
```bash
daftarBroiler[i] = new AyamBroiler(id, berat, umur, pakan);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `idAyam` dan `beratKg` adalah contoh atribut.
```bash
String idAyam;
double beratKg;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Ayam` dan `AyamBroiler`.
```bash
public Ayam(String idAyam, String jenis, double beratKg) {
    this.idAyam  = idAyam;
    this.jenis   = jenis;
    this.beratKg = beratKg;
}

public AyamBroiler(String idAyam, double beratKg, int umurHari, String pakan) {
    super(idAyam, "Broiler", beratKg);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setBeratKg` dan `setUmurHari` adalah contoh method mutator.
```bash
public void setBeratKg(double beratKg) {
    this.beratKg = beratKg;
}

public void setUmurHari(int umurHari) {
    this.umurHari = umurHari;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getIdAyam`, `getBeratKg`, `getUmurHari`, `getPakan`, `getAlasanAfkir`, dan `getTanggalAfkir` adalah contoh method accessor.
```bash
public String getIdAyam() {
    return idAyam;
}

public double getBeratKg() {
    return beratKg;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `idAyam` dan `beratKg` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.
```bash
private String idAyam;
private double beratKg;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `AyamBroiler` mewarisi `Ayam` dengan sintaks `extends`.
```bash
public class AyamBroiler extends Ayam {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilInfo(String)` di `AyamAfkir` merupakan overloading method `tampilInfo` dan `tampilInfo` di `AyamBroiler` merupakan override dari method `tampilInfo` di `Ayam`.
```bash
public void tampilInfo(String catatan) {
    tampilInfo();
    System.out.println(">> Catatan: " + catatan);
}

@Override
public void tampilInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `kategoriAyam` dan seleksi `if else` dalam method `statusPanen`.
```bash
public String kategoriAyam() {
    if (beratKg >= 2.0) {
        return "Besar";
    } else if (beratKg >= 1.5) {
        return "Sedang";
    } else {
        return "Kecil";
    }
}

public String statusPanen() {
    if (umurHari >= 35 && getBeratKg() >= 1.5) {
        return "SIAP PANEN";
    } else {
        return "BELUM SIAP";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.
```bash
for (int i = 0; i < daftarBroiler.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.
```bash
Scanner scanner = new Scanner(System.in);
System.out.print("ID Ayam    : ");
String id = scanner.nextLine();
System.out.println("Data Ayam Broiler:");
ayam.tampilInfo();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `AyamBroiler[] daftarBroiler = new AyamBroiler[jumlah];` adalah contoh penggunaan array.
```bash
AyamBroiler[] daftarBroiler = new AyamBroiler[jumlah];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.
```bash
try {
     System.out.print("ID Ayam    : ");
     String id = scanner.nextLine();

     System.out.print("Berat (kg) : ");
     double berat = Double.parseDouble(scanner.nextLine());

     System.out.print("Umur (hari): ");
     int umur = Integer.parseInt(scanner.nextLine());

     System.out.print("Pakan      : ");
     String pakan = scanner.nextLine();

     // OBJEK dibuat dari class AyamBroiler - Konstruktor dipanggil
     daftarBroiler[i] = new AyamBroiler(id, berat, umur, pakan);
     System.out.println("Data berhasil disimpan!");

} catch (NumberFormatException e) {
    System.out.println("Input angka tidak valid! Data diisi dengan nilai default.");
    System.out.println("Detail error: " + e.getMessage());
    // Buat objek default jika input salah
    daftarBroiler[i] = new AyamBroiler("DEFAULT-" + (i + 1), 1.0, 28, "Standar");
} catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
    daftarBroiler[i] = new AyamBroiler("DEFAULT-" + (i + 1), 1.0, 28, "Standar");
}     
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ali Husin

NPM: 2410010570
