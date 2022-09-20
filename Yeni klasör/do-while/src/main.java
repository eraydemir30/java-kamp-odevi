import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi Giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println("Sayinin basamak sayisi: ");
        int basamak = scanner.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        
        do { 
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi = gecici_sayi / 10;
            toplam += Math.pow(basamak_degeri,basamak);
            
        } while (gecici_sayi > 0);
        if (sayi == toplam) {
            System.out.println("Bu sayi bir amstrong sayidir");
            
        }
        else{
            System.out.println("Bu sayi bir armstrong sayisi degildir");
        }
            
    }
}
