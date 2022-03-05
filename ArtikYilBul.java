package Uygulamalar;
import java.util.Scanner;

public class ArtikYilBul {
    /*Artık Yıl Nedir?
    *Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl.
    *Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır.
    * 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Hesaplamak istediğiniz yıl : ");
        int yil=input.nextInt();

        if(yil%4==0){
            if(yil%100==0){
                String sonuc=yil%400==0? (yil+" yılı artık yıldır."):(yil+" yılı artık yıl değildir.");
                System.out.print(sonuc);
            }
            else{
                System.out.print(yil+" yılı artık yıldır");
            }
        }else{
            System.out.print(yil+" yılı artık yıl değildir.");
        }
    }
}
