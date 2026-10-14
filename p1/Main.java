// Program utama: membuat objek dan menampilkan informasi hewan
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Informasi Hewan ===");
        System.out.println();

        // Objek 1: Kucing bernama Milo
        Kucing kucing = new Kucing();
        kucing.setNama("Milo");
        System.out.println("Nama Hewan: " + kucing.getNama());
        System.out.println("Jenis Hewan: Kucing");
        kucing.bersuara();
        System.out.println();

        // Objek 2: Sapi bernama Sapi Momo
        Sapi sapi = new Sapi();
        sapi.setNama("Sapi Momo");
        System.out.println("Nama Hewan: " + sapi.getNama());
        System.out.println("Jenis Hewan: Sapi");
        sapi.bersuara();
    }
}
