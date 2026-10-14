// Parent class untuk semua hewan
public class Hewan {
    // Encapsulation: atribut private, hanya bisa diakses via getter/setter
    private String nama;

    // Constructor kosong
    public Hewan() {
    }

    // Constructor dengan parameter nama
    public Hewan(String nama) {
        this.nama = nama;
    }

    // Getter untuk membaca nama
    public String getNama() {
        return nama;
    }

    // Setter untuk mengubah nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method yang akan di-override oleh subclass
    public void bersuara() {
        System.out.println("Suara: Hewan bersuara...");
    }
}
