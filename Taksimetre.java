package Uygulamalar;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        /*
        * Taksimetre açılış ücreti 10 TL'dir.
        * Km başına 2.20 TL ücret alınmaktadır.
        * Taksimetre tutarı 20 TL 'nin altında olsa bile minimum 20TL ücret alınmaktadır.
        */

        Scanner input=new Scanner(System.in);
        System.out.print("Kaç km yol gittiniz : ");5
        float kacKm=input.nextFloat();

        float km=2.20f;
        int tmAcilis=10;

        float tmUcret=tmAcilis+(kacKm*km);

        float ucret=tmUcret>20 ? tmUcret : 20;
        System.out.print("Ücret : "+ucret);
    }
}
