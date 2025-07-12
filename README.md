# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data sepatu menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama sepatu dan merk sepatu, dan memberikan output berupa informasi detail dari sepatu tersebut seperti ukuran, warna, dan harga.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `sepatu`, `infosepatu`, dan `produksepatu` adalah contoh dari class.

```bash
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

public class infosepatu extends sepatu {
    ...
}

public class produksepatu {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `spt[i] = new sepatu(nama_sepatu, merk);` adalah contoh pembuatan object.

```bash
spt[i] = new sepatu(nama_sepatu, merk);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama_` dan `merk` adalah contoh atribut.

```bash
String nama_sepatu;
String merk;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `nama_sepatu` dan `merk`.

```bash
public sepatu(String nama_sepatu, String merk) {
    this.nama_sepatu = nama_sepatu;
    this.merk = merk;
}

}

public infoSepatu(String nama_sepatu, String merk, String ukuran, int harga, String warna) {
    super(nama_sepatu, merk);
    this.ukuran = ukuran;
    this.harga = harga;
    this.warna = warna;
}

}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama_sepatu` dan `setmerk` adalah contoh method mutator.

```bash
public void setNama_sepatu(String nama_sepatu) {
    this.nama_sepatu = nama_sepatu;
}

public void setUkuran(String ukuran) {
    this.ukuran = ukuran;
}

public void setHarga(int harga) {
    this.harga = harga;
}

public void setWarna(String warna) {
    this.warna = warna;
}

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama_sepatu`, `getmerk`, `getwarna`, `getukuran`, dan `getharga` adalah contoh method accessor.

```bash
public String getNama_sepatu() {
    return nama_sepatu;
}

public String getMerk() {
    return merk;
}

public String getUkuran() {
    return ukuran;
}

public int getHarga() {
    return harga;
}

public String getWarna() {
    return warna;
}

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama_sepatu` dan `merk` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama_sepatu;
private String merk;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `produksepatu` mewarisi `sepatu` dengan sintaks `extends`.

```bash
public class produksepatu extends sepatu {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `sepatu` merupakan overloading method `displayInfo` dan `displayInfo` di `produksepatu` merupakan override dari method `displayInfo` di `sepatu`.

```bash

public String displayInfo() {
    return super.displayInfo() +
           "\nUkuran: " + ukuran +
           "\nWarna: " + warna +
           "\nHarga: Rp" + harga;
}

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi tertentu. Dalam program ini, seleksi digunakan untuk menentukan kategori sepatu berdasarkan
```bash



```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menginput dan menampilkan data untuk beberapa sepatu. Menggunakan for.

```bash
for (int i = 0; i < sepatu.length; i++) {
    // proses input
}

```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);

System.out.print("Nama Sepatu: ");
String nama = input.nextLine();

System.out.print("Merk Sepatu: ");
String merk = input.nextLine();

System.out.print("Ukuran Sepatu: ");
String ukuran = input.nextLine();

System.out.print("Warna Sepatu: ");
String warna = input.nextLine();

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `produksepatu[] sepatu = new produksepatu[2];` adalah contoh penggunaan array.

```bash
infoSepatu[] sepatu = new infoSepatu[2];

```

14. **Error Handling** digunakan untuk Menangani kesalahan input harga agar program tidak crash jika user salah memasukkan data.
```bash
try {
    System.out.print("Harga Sepatu: ");
    harga = Integer.parseInt(input.nextLine());
} catch (Exception e) {
    System.out.println("Input harga tidak valid, akan diset ke 0");
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

Nama: Regina Faradila
NPM: 2310010641
