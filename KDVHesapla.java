package Uygulamalar;
import java.util.Scanner;

public class KDVHesapla {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("KDV'sini hesaplamak istediğiniz tutarı giriniz : ");
        double anaPara=input.nextDouble();

        int kdvOrani= anaPara>1000 ? 8 : 18;
        double kdvMiktari=(anaPara*kdvOrani)/100;
        double sonTutar=anaPara+kdvMiktari;

        System.out.print("Tutar : "+anaPara+"\nKDV Tutarı : "+kdvMiktari+"\nToplam Tutar : "+sonTutar);

    }
}
