public class PolaBangun {
    public static void main(String[] args) {
        // 1. Segitiga siku-siku: for loop
        System.out.println("Segitiga Siku-Siku:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 2. Segitiga sama sisi: do-while loop
        System.out.println("Segitiga Sama Sisi:");
        int baris = 1;
        do {
            int spasi = 5 - baris;
            int lebar = spasi + (2 * baris - 1);
            int kolom = 1;
            do {
                if (kolom <= spasi) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                kolom++;
            } while (kolom <= lebar);
            System.out.println();
            baris++;
        } while (baris <= 5);
        System.out.println();

        // 3. Persegi: while loop
        System.out.println("Persegi:");
        int b = 1;
        while (b <= 5) {
            int k = 1;
            while (k <= 5) {
                System.out.print(b);
                if (k < 5) {
                    System.out.print(" ");
                }
                k++;
            }
            System.out.println();
            b++;
        }
    }
}