package Uygulamalar;
import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args){
     int mat,fizik,kimya,bio,turkce,tarih,cog;

     Scanner input=new Scanner(System.in);
     System.out.print("Matematik notunuz : ");
     mat= input.nextInt();
     System.out.print("Fizik notunuz : ");
     fizik=input.nextInt();
     System.out.print("Kimya notunuz : ");
     kimya=input.nextInt();
     System.out.print("Biyoloji notunuz : ");
     bio= input.nextInt();
     System.out.print("Türkçe notunuz : ");
     turkce=input.nextInt();
     System.out.print("Tarih notunuz : ");
     tarih=input.nextInt();
     System.out.print("Coğrafya notunuz : ");
     cog=input.nextInt();

     int toplam=mat+fizik+kimya+bio+tarih+turkce+cog;
     double ortalama=toplam/7.0;
     System.out.println("Ortalanız : "+ortalama);

     String strDurum=ortalama>=60?"Geçtiniz":"Kaldınız";
     System.out.print(strDurum);

    }

}
