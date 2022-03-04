package Uygulamalar;
import java.util.Scanner;

public class Daire_Alan_Cevre_Hesabi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        int yariCap=input.nextInt();
        float pi=3.14f;
        float alan=pi*yariCap*yariCap;
        float cevre=2*pi*yariCap;
        System.out.println("Dairenin alanı : "+alan);
        System.out.println("Dairenin çevresi : "+cevre);
    }
}
