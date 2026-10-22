import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        
        int nilai = input.nextInt();
        if (nilai >= 80 && nilai == 100){
            System.out.println("nilai anda = A");            
        } else if (nilai >= 70 && nilai < 79){
            System.out.println("nilai anda = B");
        } else if (nilai >= 60 && nilai < 69){
            System.out.println("nilai anda = c");
        } else if (nilai < 60  && nilai >= 0 ){
            System.out.println("nilai anda = D WAJIB PENGULANGAN!");
        } else {
            System.out.println("bukan angka atau format nilai tidak sesuai");            
        }
        input.close();
    }
}