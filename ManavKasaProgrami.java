package Uygulamalar;
import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        float armut=2.14f;
        float elma=3.67f;
        float domates=1.11f;
        float muz=0.95f;
        float patlican=5.0f;
        System.out.print("Armut kaç kilo : ");
        float armutKg=input.nextFloat();
        System.out.print("Elma kaç kilo : ");
        float elmaKg=input.nextFloat();
        System.out.print("Domates kaç kilo : ");
        float domatesKg=input.nextFloat();
        System.out.print("Muz kaç kilo : ");
        float muzKg=input.nextFloat();
        System.out.print("Patlıcan kaç kilo : ");
        float patlicanKg=input.nextFloat();

        float toplam=(armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);
        System.out.print("Ödeme tutarı : "+toplam+"TL");
    }
}
