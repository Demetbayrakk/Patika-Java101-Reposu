package Uygulamalar;
import java.util.Scanner;

public class HipotenüsüBul {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("1. Kenar uzunluğunu girin : ");
        int kenar1=input.nextInt();
        System.out.print("2. kenar uzunluğunu girin : ");
        int kenar2=input.nextInt();

        double hipotenüs=Math.sqrt(Math.pow(kenar1,2)+Math.pow(kenar2,2));
        System.out.print(hipotenüs);
    }
}
