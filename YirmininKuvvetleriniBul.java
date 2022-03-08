package Uygulamalar;
import java.util.Scanner;

public class YirmininKuvvetleriniBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi=input.nextInt();

        for(int i=1; i<=sayi;i*=20){
            System.out.println(i);
        }
    }
}
