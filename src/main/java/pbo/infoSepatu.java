package pbo;

public class infoSepatu {
    // Atribut (enkapsulasi)
    private String ukuran;
    private int harga;
    private String warna;

    // Constructor
    public infoSepatu(String ukuran, int harga, String warna) {
        this.ukuran = ukuran;
        this.harga = harga;
        this.warna = warna;
    }

    // Setter
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter
    public String getUkuran() {
        return ukuran;
    }

    public int getHarga() {
        return harga;
    }

    public String getWarna() {
        return warna;
    }

    // Method tampil informasi
    public void tampilInfo() {
        System.out.println("Ukuran Sepatu: " + ukuran);
        System.out.println("Harga Sepatu : Rp" + harga);
        System.out.println("Warna Sepatu : " + warna);
    }
}
