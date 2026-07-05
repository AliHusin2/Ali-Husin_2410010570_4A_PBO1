package PBO;

// INHERITANCE = AyamAfkir juga mewarisi dari Ayam
// Satu parent bisa punya banyak child class
public class AyamAfkir extends Ayam {

    // Atribut tambahan khusus AyamAfkir
    private String alasanAfkir;
    private String tanggalAfkir;

    // KONSTRUKTOR
    public AyamAfkir(String idAyam, double beratKg, String alasanAfkir, String tanggalAfkir) {
        super(idAyam, "Afkir", beratKg); // panggil konstruktor Ayam
        this.alasanAfkir  = alasanAfkir;
        this.tanggalAfkir = tanggalAfkir;
    }

    // GETTER & SETTER atribut tambahan
    public String getAlasanAfkir()  { return alasanAfkir;  }
    public String getTanggalAfkir() { return tanggalAfkir; }
    public void setAlasanAfkir(String alasan)    { this.alasanAfkir  = alasan;   }
    public void setTanggalAfkir(String tanggal)  { this.tanggalAfkir = tanggal;  }

    // POLYMORFISME (Override) - tampilInfo versi AyamAfkir
    @Override
    public void tampilInfo() {
        System.out.println("======= Data Ayam Afkir =======");
        System.out.println("ID Ayam  : " + getIdAyam());
        System.out.println("Berat    : " + getBeratKg() + " kg");
        System.out.println("Alasan   : " + alasanAfkir);
        System.out.println("Tanggal  : " + tanggalAfkir);
        System.out.println("Kategori : " + kategoriAyam());
        System.out.println();
    }

    // POLYMORFISME (Overloading) - nama method sama tapi parameter berbeda
    public void tampilInfo(String catatan) {
        tampilInfo(); // panggil tampilInfo() biasa dulu
        System.out.println(">> Catatan: " + catatan);
        System.out.println();
    }
}
