package Uygulamalar;
import java.util.Scanner;

public class FaktoriyelHesapla {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Faktöriyelini hesaplamak istediğiniz sayı : ");
        int sayi=input.nextInt(),faktoriyel=1;

        for(int i=sayi;i>1;i--){
            faktoriyel*=i;
        }
        System.out.print("faktoriyel="+faktoriyel);
    }
}
