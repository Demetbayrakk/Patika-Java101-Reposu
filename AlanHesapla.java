package Uygulamalar;
import java.util.Scanner;

public class AlanHesapla {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Üçgenin 1. kenar uzunluğu : ");
        int kenar1=input.nextInt();
        System.out.print("Üçgenin 2. kenar uzunluğu : ");
        int kenar2=input.nextInt();
        System.out.print("Üçgenin 3. kenar uzunluğu : ");
        int kenar3=input.nextInt();

        int cevre=kenar1+kenar2+kenar3;
        double u=cevre/2;
        double alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.print("Üçgenin alanı : "+alan);

    }
}
