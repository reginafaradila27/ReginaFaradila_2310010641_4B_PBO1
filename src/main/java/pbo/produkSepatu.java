package pbo;

import java.util.Scanner;

public class produkSepatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        sepatu[] daftarSepatu = new sepatu[100];
        infoSepatu[] daftarinfo = new infoSepatu[100];
        int count = 0;

        int pilihan;
        do {
            System.out.println("\n=== MENU PRODUK SEPATU ===");
            System.out.println("1. Input Data Sepatu");
            System.out.println("2. Tampilkan Semua Sepatu");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(input.nextLine());

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Input Data Sepatu ---");

                    System.out.print("Masukkan Nama Sepatu : ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan Merek Sepatu: ");
                    String merek = input.nextLine();

                    System.out.print("Masukkan Ukuran Sepatu: ");
                    String ukuran = input.nextLine();

                    System.out.print("Masukkan Warna Sepatu : ");
                    String warna = input.nextLine();

                    int harga = 0;
                    boolean valid = false;
                    while (!valid) {
                        System.out.print("Masukkan Harga Sepatu : ");
                        try {
                            harga = Integer.parseInt(input.nextLine());
                            valid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Input tidak valid! Harga harus berupa angka.");
                        }
                    }

                    daftarSepatu[count] = new sepatu(nama, merek);
                    daftarinfo[count] = new infoSepatu(ukuran, harga, warna);
                    count++;
                    System.out.println("✅ Data sepatu berhasil disimpan!");
                    break;

                case 2:
                    System.out.println("\n--- Daftar Produk Sepatu ---");
                    if (count == 0) {
                        System.out.println("Belum ada data sepatu.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nSepatu ke-" + (i + 1));
                            daftarSepatu[i].displayInfo();
                            daftarinfo[i].tampilInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilihan != 3);

        input.close();
    }
}
