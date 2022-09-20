
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. vize notunuzu giriniz: ");
        int vize1 = scanner.nextInt();
        System.out.print("2. vize notunuzu giriniz: ");
        int vize2 = scanner.nextInt();
        System.out.print("final notunuzu giriniz: ");
        int f1 = scanner.nextInt();
        
        double toplam = ((vize1*30/100) + (vize2*30/100) + (f1*40/100));
        
        if (toplam >= 90) {
            System.out.println("AA");
        }
        else if (toplam >= 85) {
            System.out.println("BA");
        }
        else if (toplam >= 80) {
            System.out.println("BB");
        }
        else if (toplam >= 75) {
            System.out.println("CB");
        }
        else if (toplam >= 70) {
            System.out.println("CC");
        }
        else if (toplam >= 65) {
            System.out.println("DC");
        }
        else if (toplam >= 60) {
            System.out.println("DD Aldiniz ve kaldiniz");
        }
        else if (toplam >= 55) {
            System.out.println("FD Aldiniz ve Kaldiniz");
        }
        else {
            System.out.println("FF Aldiniz ve kaldiniz");
        }
    }
    
}
