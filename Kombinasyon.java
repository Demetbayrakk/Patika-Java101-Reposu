package Uygulamalar;
import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        /*
        *N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        *N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        *Java ile kombinasyon hesaplayan program yazınız.
        *Kümenin toplam eleman sayısı=n;
        *Oluşturulacak grupların eleman sayısı=r;
        */
        Scanner input=new Scanner(System.in);
        System.out.print("Kümenin toplam eleman sayısı : ");
        int n=input.nextInt();
        System.out.print("Kaç elemanlı gruplar oluşturmak istiyorsunuz : ");
        int r=input.nextInt();
        int rFaktoriyel=1,n_rFaktoriyel=1,nFaktoriyel=1,kombinasyon=0;

        for(int i=n;i>1;i--){
            nFaktoriyel*=i;
        }
        for(int j=r;j>1;j--){
            rFaktoriyel*=j;
        }
        for(int k=(n-r);k>1;k--){
            n_rFaktoriyel*=k;
        }
        kombinasyon=nFaktoriyel/(rFaktoriyel*n_rFaktoriyel);
        System.out.print("C("+n+","+r+")="+kombinasyon);
    }
}
