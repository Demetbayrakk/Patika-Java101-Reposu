package Uygulamalar;
import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;
        float toplamNot=0,ortalama;
        int dersSay=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunuzu girin : ");
        mat=input.nextInt();
        if(mat>=0&&mat<=100){
            toplamNot +=mat;
            dersSay++;
        }
        System.out.print("Fizik notunuzu girin : ");
        fizik=input.nextInt();
        if(fizik>=0&&fizik<=100){
            toplamNot +=fizik;
            dersSay++;
        }
        System.out.print("Kimya notunuzu girin : ");
        kimya=input.nextInt();
        if(kimya>=0&&kimya<=100){
            toplamNot +=kimya;
            dersSay++;
        }
        System.out.print("Türkçe notunuzu girin : ");
        turkce=input.nextInt();
        if(turkce>=0&&turkce<=100){
            toplamNot +=turkce;
            dersSay++;
        }
        System.out.print("Müzik notunuzu girin : ");
        muzik=input.nextInt();
        if(muzik>=0&&muzik<=100){
            toplamNot +=muzik;
            dersSay++;
        }

        ortalama=toplamNot/dersSay;
        System.out.println("Ortalamanız : "+ortalama);
        String durum=ortalama>=55 ? "Geçtiniz":"Kaldınız";
        System.out.print(durum);
    }
}
