package Uygulamalar;
import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("İlk sayı : ");
        int sayi1=input.nextInt();
        System.out.print("İkinci sayı : ");
        int sayi2=input.nextInt();
        System.out.print("Üçüncü sayı : ");
        int sayi3=input.nextInt();

        if(sayi1>sayi2){
            if(sayi3>sayi1){
                System.out.print(sayi3+">"+sayi1+">"+sayi2);
            }else if(sayi3>sayi2){
                System.out.print(sayi1+">"+sayi3+">"+sayi2);
            }else{
                System.out.print(sayi1+">"+sayi2+">"+sayi3);
            }
        }
    }
}
