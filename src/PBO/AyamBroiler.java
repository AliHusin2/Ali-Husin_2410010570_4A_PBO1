package PBO;

// INHERITANCE = AyamBroiler mewarisi semua dari Ayam menggunakan "extends"
public class AyamBroiler extends Ayam {

    // Atribut tambahan khusus AyamBroiler
    private int    umurHari;
    private String pakan;

    // KONSTRUKTOR - super() memanggil konstruktor parent (Ayam)
    public AyamBroiler(String idAyam, double beratKg, int umurHari, String pakan) {
        super(idAyam, "Broiler", beratKg); // panggil konstruktor Ayam
        this.umurHari = umurHari;
        this.pakan    = pakan;
    }

    // GETTER & SETTER atribut tambahan
    public int    getUmurHari() { return umurHari; }
    public String getPakan()    { return pakan;    }
    public void setUmurHari(int umurHari) { this.umurHari = umurHari; }
    public void setPakan(String pakan)    { this.pakan    = pakan;    }

    // SELEKSI - cek status panen berdasarkan umur dan berat
    public String statusPanen() {
        if (umurHari >= 35 && getBeratKg() >= 1.5) {
            return "SIAP PANEN";
        } else if (umurHari >= 28) {
            return "HAMPIR SIAP";
        } else {
            return "BELUM SIAP";
        }
    }

    // POLYMORFISME - @Override menimpa tampilInfo() dari parent Ayam
    @Override
    public void tampilInfo() {
        System.out.println("======= Data Ayam Broiler =======");
        System.out.println("ID Ayam  : " + getIdAyam());
        System.out.println("Berat    : " + getBeratKg() + " kg");
        System.out.println("Umur     : " + umurHari + " hari");
        System.out.println("Pakan    : " + pakan);
        System.out.println("Kategori : " + kategoriAyam());
        System.out.println("Status   : " + statusPanen());
        System.out.println();
    }
}
