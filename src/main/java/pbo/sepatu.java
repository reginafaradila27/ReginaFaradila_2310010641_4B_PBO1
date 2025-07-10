package pbo;


public class sepatu {
    // atribut dan encapsulation
    private String nama_sepatu;
    private String merk;

    // constructor
    public sepatu(String nama_sepatu, String merk) {
        this.nama_sepatu = nama_sepatu;
        this.merk = merk;
    }

    // mutator (setter)
    public void setNama_sepatu(String nama_sepatu) {
        this.nama_sepatu = nama_sepatu;
    }

    public void setmerk(String merk) {
        this.merk = merk;
    }

    public String getNama_sepatu() {
        return nama_sepatu;
    }

    public String getMerk() {
        return merk;
    }

    public void displayInfo() {
        System.out.println("Nama sepatu : " + nama_sepatu);
        System.out.println("Merk Sepatu: " + merk);
}


    
    
}
