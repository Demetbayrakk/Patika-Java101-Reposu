package Uygulamalar;
import java.util.Scanner;

public class BolmeBolunebilme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi=input.nextInt(), sayac=0,toplam=0;
        float ortalama;

        for(int i=1;i<=sayi;i++){
            if(i%12==0){
                toplam+=i;
                sayac++;
            }
        }
        ortalama=toplam/sayac;
        System.out.print("0-"+sayi+" arası 12'ye tam bölünen sayıların ortalaması : "+ortalama);


    }
}