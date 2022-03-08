package Uygulamalar;
import java.util.Scanner;

public class DonguOrnek {
    /*
    * Kullanıcıdan alınan sayılardan 4'e tam bölünenleri toplar.
    * Kullanıcı tek sayı girdiğinde program sona erer.
    */
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int sayi, toplam=0;

        do{
            System.out.print("Sayı girin : ");
            sayi=input.nextInt();
            if(sayi%4==0){
                toplam+=sayi;
            }

        }while(sayi%2==0);
        System.out.print("Toplam : "+toplam);
    }
}
