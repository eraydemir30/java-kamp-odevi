
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giris_hakki = 3;
        
        String kullanici_adi = "Eray Demir";
        String parola = "123456";
       
        while (true) {            
            System.out.println("Lutfen kullanici adinizi girin: ");
            String kullanici = scanner.nextLine();
            System.out.println("Lutfen parolanizi girin: ");
            String parolaa = scanner.nextLine();
            
            if (kullanici_adi.equals(kullanici) && !parola.equals(parolaa)) {
                System.out.println("Parolaniz yanlis");
                giris_hakki -= 1;
            }
            else if (!kullanici_adi.equals(kullanici) && parola.equals(parolaa)) {
                System.out.println("Kullanici adiniz yanlis");
                giris_hakki -= 1;
            }
            else if (kullanici_adi.equals(kullanici) && parola.equals(parolaa)) {
                System.out.println("Sisteme hosgeldiniz");
                break;
            }
            else {
                System.out.println("Kullanici adiniz ve parolaniz yanlis");
                giris_hakki -= 1;
            }
        }
    }
}
