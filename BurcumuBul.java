package Uygulamalar;
import java.util.Scanner;

public class BurcumuBul {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart*/

        System.out.print("Kaçıncı ayda doğdunuz? : ");
        int ay=input.nextInt();
        System.out.print("Ayın kaçıncı günü doğdunuz? : ");
        int gun=input.nextInt();
        String burc;

        switch (ay){
            case 1:
                if(gun>0 && gun<=31){
                burc=gun>=22?"Kova":"Oğlak";
                System.out.print("Burcunuz : "+burc);
                break;
                }
            case 2:
                if(gun>0 && gun<=29) {
                    burc = gun >= 20 ? "Balık" : "Kova";
                    System.out.print("Burcunuz : " + burc);
                    break;
                }
            case 3:
                if(gun>0 && gun<=31) {
                    burc = gun >= 21 ? "Koç" : "Balık";
                    System.out.print("Burcunuz : " + burc);
                    break;
                }
            case 4:
                if(gun>0 && gun<=30) {
                    burc = gun >= 21 ? "Boğa" : "Koç";
                    System.out.print("Burcunuz : " + burc);
                    break;
                }
            case 5:
                if(gun>0 && gun<=31) {
                    burc = gun >= 22 ? "İkizler" : "Boğa";
                    System.out.print("Burcunuz : " + burc);
                    break;
                }
            case 6:
                if(gun>0 && gun<=30) {
                    burc = gun >= 23 ? "Yengeç" : "İkizler";
                    System.out.print("Burcunuz : " + burc);
                    break;
                }
            case 7:
                if(gun>0 && gun<=31) {
                    burc = gun >= 23 ? "Aslan" : "Yengeç";
                    System.out.print("Burcunuz : " + burc);
                    break;
                }
            case 8:
                if(gun>0 && gun<=31) {
                    burc = gun >= 23 ? "Başak" : "Aslan";
                    System.out.print("Burcunuz : " + burc);
                    break;
                }
            case 9:
                if(gun>0 && gun<=30) {
                    burc = gun >= 23 ? "Terazi" : "Başak";
                    System.out.print("Burcunuz : " + burc);
                    break;
                }
            case 10:
                if(gun>0 && gun<=31) {
                    burc = gun >= 23 ? "Akrep" : "Terazi";
                    System.out.print("Burcunuz : " + burc);
                    break;
                }
            case 11:
                if(gun>0 && gun<=30) {
                    burc = gun >= 22 ? "Yay" : "Akrep";
                    System.out.print("Burcunuz : " + burc);
                    break;
                }
            case 12:
                if(gun>0 && gun<=31) {
                    burc = gun >= 22 ? "Oğlak" : "Yay";
                    System.out.print("Burcunuz : " + burc);
                    break;
                }
            default:
                System.out.print("Geçersiz değer girdiniz.");
                break;
        }

    }
}
