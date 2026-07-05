package PBO;

// CLASS = blueprint/cetakan untuk membuat objek ayam
// ENKAPSULASI = semua atribut dibuat private
public class Ayam {

    // ATRIBUT - private = ENKAPSULASI
    private String idAyam;
    private String jenis;
    private double beratKg;

    // KONSTRUKTOR = dijalankan otomatis saat objek dibuat
    public Ayam(String idAyam, String jenis, double beratKg) {
        this.idAyam  = idAyam;
        this.jenis   = jenis;
        this.beratKg = beratKg;
    }

    // ===== MUTATOR (SETTER) = mengubah nilai atribut =====
    public void setIdAyam(String idAyam) {
        this.idAyam = idAyam;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setBeratKg(double beratKg) {
        // SELEKSI - validasi berat tidak boleh minus atau nol
        if (beratKg > 0) {
            this.beratKg = beratKg;
        } else {
            System.out.println("Berat tidak valid! Harus lebih dari 0 kg.");
        }
    }

    // ===== ACCESSOR (GETTER) = membaca nilai atribut =====
    public String getIdAyam()  { return idAyam;  }
    public String getJenis()   { return jenis;   }
    public double getBeratKg() { return beratKg; }

    // SELEKSI - menentukan kategori berat ayam
    public String kategoriAyam() {
        if (beratKg >= 2.0) {
            return "Besar (>= 2.0 kg)";
        } else if (beratKg >= 1.5) {
            return "Sedang (1.5 - 1.9 kg)";
        } else {
            return "Kecil (< 1.5 kg)";
        }
    }

    // METHOD tampilInfo = akan di-OVERRIDE oleh child class (dasar Polymorfisme)
    public void tampilInfo() {
        System.out.println("ID Ayam : " + idAyam);
        System.out.println("Jenis   : " + jenis);
        System.out.println("Berat   : " + beratKg + " kg");
    }
}
