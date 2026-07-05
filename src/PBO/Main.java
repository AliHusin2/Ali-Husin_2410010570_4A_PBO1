package PBO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("     SISTEM MANAJEMEN AYAM BROILER - PBO");
        System.out.println("=================================================\n");

        // IO SEDERHANA + ERROR HANDLING
        int jumlah = 0;
        while (jumlah <= 0) {
            try {
                System.out.print("Masukkan jumlah data ayam broiler: ");
                jumlah = Integer.parseInt(scanner.nextLine());
                if (jumlah <= 0) {
                    System.out.println("Jumlah harus lebih dari 0! Coba lagi.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Masukkan angka bulat.");
                System.out.println("Detail error: " + e.getMessage());
            }
        }

        // ARRAY - menyimpan banyak objek AyamBroiler sekaligus
        AyamBroiler[] daftarBroiler = new AyamBroiler[jumlah];

        // PERULANGAN + IO + ERROR HANDLING
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n--- Input Data Ayam Broiler ke-" + (i + 1) + " ---");
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
        }

        // Data ayam afkir (langsung diisi)
        AyamAfkir afkir1 = new AyamAfkir("AFR-001", 1.1, "Sakit", "2025-01-10");
        AyamAfkir afkir2 = new AyamAfkir("AFR-002", 0.9, "Cacat Fisik", "2025-01-12");

        // MUTATOR (SETTER) - mengubah data lewat setter
        System.out.println("\n>> [ENKAPSULASI & MUTATOR] Mengubah berat afkir1:");
        afkir1.setBeratKg(1.2);                // berhasil diubah
        afkir1.setBeratKg(-0.5);              // ditolak karena minus
        System.out.println("Berat sekarang: " + afkir1.getBeratKg() + " kg"); // ACCESSOR

        // POLYMORFISME via array parent
        System.out.println("\n=================================================");
        System.out.println("   DATA SEMUA AYAM");
        System.out.println("=================================================");

        Ayam[] semuaAyam = new Ayam[daftarBroiler.length + 2];
        for (int i = 0; i < daftarBroiler.length; i++) {
            semuaAyam[i] = daftarBroiler[i];
        }
        semuaAyam[daftarBroiler.length]     = afkir1;
        semuaAyam[daftarBroiler.length + 1] = afkir2;

        // PERULANGAN - tampilkan semua data
        // POLYMORFISME - tampilInfo() otomatis pakai versi masing-masing class
        for (Ayam a : semuaAyam) {
            a.tampilInfo();
        }

        // POLYMORFISME - Overloading (tampilInfo dengan parameter catatan)
        System.out.println(">> [POLYMORFISME - OVERLOADING] Tampil dengan catatan:");
        afkir1.tampilInfo("Segera pisahkan dari kandang utama!");

        // ACCESSOR - membaca data via getter
        System.out.println(">> [ACCESSOR] Rekap Data:");
        System.out.println("Total ayam broiler : " + daftarBroiler.length + " ekor");
        System.out.println("Total ayam afkir   : 2 ekor");
        System.out.println("ID Afkir 1         : " + afkir1.getIdAyam());
        System.out.println("Alasan Afkir 1     : " + afkir1.getAlasanAfkir());

        scanner.close();
        System.out.println("\nProgram selesai. Terima kasih!");
    }
}
