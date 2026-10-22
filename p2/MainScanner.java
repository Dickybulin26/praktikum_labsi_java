import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan pilihan menu: ");
        
        int pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
            System.out.println("Nasi Goreng");
            break;
            case 2:
            System.out.println("Mie Goreng");
            break;
            case 3:
            System.out.println("Soto Ayam");
            break;
            default:
            System.out.println("menu tidak tersedia");
            break;
        }
        input.close();
    }
}