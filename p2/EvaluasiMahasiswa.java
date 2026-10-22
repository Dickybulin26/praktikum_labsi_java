import java.util.Scanner;

public class EvaluasiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Variabel: nama, nilai ujian, dan status kehadiran
        String nama;
        int nilai;
        int kehadiran;
        boolean hadirMemenuhi;

        System.out.print("Nama Mahasiswa      : ");
        nama = input.nextLine();
        System.out.print("Nilai Ujian (0-100) : ");
        nilai = input.nextInt();
        System.out.print("Kehadiran (%)       : ");
        kehadiran = input.nextInt();

        // Kehadiran memenuhi syarat jika minimal 75%
        hadirMemenuhi = kehadiran >= 75;

        String status = "";
        String predikat = "";
        System.out.println();

        // 2. if: validasi rentang nilai 0-100
        if (nilai >= 0 && nilai <= 100) {
            System.out.println("Nilai valid");

            // 3. if-else: kelulusan (minimal 60)
            if (nilai >= 60) {
                status = "Lulus";
            } else {
                status = "Tidak Lulus";
            }
            System.out.println("Status: " + status);

            // 5. nested if: cek kehadiran hanya jika lulus
            if (status.equals("Lulus")) {
                if (hadirMemenuhi) {
                    System.out.println("Kehadiran memenuhi syarat");
                } else {
                    System.out.println("Kehadiran tidak memenuhi syarat");
                }
            }

            // 4. if-else if-else: predikat nilai
            if (nilai >= 80) {
                predikat = "A";
            } else if (nilai >= 70) {
                predikat = "B";
            } else if (nilai >= 60) {
                predikat = "C";
            } else {
                predikat = "D";
            }
            System.out.println("Predikat: " + predikat);

            // 6. switch-case: menu informasi
            System.out.println();
            System.out.println("=== Menu Informasi ===");
            System.out.println("1. Nama dan nilai mahasiswa");
            System.out.println("2. Status kelulusan");
            System.out.println("3. Predikat nilai");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.println("Informasi: Nama dan nilai mahasiswa");
                    System.out.println("Nama  : " + nama);
                    System.out.println("Nilai : " + nilai);
                    break;
                case 2:
                    System.out.println("Informasi: Status kelulusan");
                    System.out.println(nama + " dinyatakan " + status);
                    break;
                case 3:
                    System.out.println("Informasi: Predikat nilai");
                    System.out.println("Predikat " + nama + " adalah " + predikat);
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        } else {
            System.out.println("Nilai tidak valid, masukkan nilai 0 - 100");
        }

        input.close();
    }
}