
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Idman programina hosgeldiniz...");
        
        String idmanlar = "Gecerli Hareketler...\n"
                          + "Burpee\n"
                          + "Pushup\n"
                          + "Situp\n"
                          + "Squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman olusturun...");
        
        System.out.println("Burpee Sayisi: ");
        int burpee = scanner.nextInt();
        System.out.println("PushupSayisi: ");
        int pushup = scanner.nextInt();
        System.out.println("Situp Sayisi: ");
        int situp = scanner.nextInt();
        System.out.println("Squat Sayisi: ");
        int squat = scanner.nextInt();
        
        scanner.nextLine();
        
        İdman idman = new İdman(burpee, pushup, situp, squat);
        
        System.out.println("İdmanınız Basliyor.....");
                
        while (idman.idmanBittiMi() == false) {
            System.out.print("Hareket Turu(Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.print("Bu Hareketten kac adet yapmak istiyorsunuz : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
            
        }
       
    }
}
