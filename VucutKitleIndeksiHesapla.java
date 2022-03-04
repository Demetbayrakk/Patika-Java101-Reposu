package Uygulamalar;
import java.util.Scanner;

public class VucutKitleIndeksiHesapla {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        float boy=input.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz : ");
        int kilo=input.nextInt();

        float vki=kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz : "+vki);
    }
}
