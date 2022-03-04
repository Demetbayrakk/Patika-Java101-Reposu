package Uygulamalar;
import java.util.Locale;
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args){
        String kullaniciAdi,sifre;

        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı Adı : ");
        kullaniciAdi=input.nextLine();
        System.out.print("Şifre : ");
        sifre=input.nextLine();

        if(kullaniciAdi.equals("demetbayrak")&&sifre.equals("123")){
            System.out.print("Giriş başarılı!");
        }
        else if(!sifre.equals("123")){
           System.out.print("Şifrenizi sıfırlamak ister misiniz ? (E/H) : ");
           String cevap=input.nextLine().toUpperCase(Locale.ROOT);

           switch (cevap){
               case "E":
                   System.out.print("Yeni şifrenizi giriniz : ");
                   String yeniSifre=input.nextLine();
                   if(yeniSifre.equals("123")){
                       System.out.print("Yeni şifreniz eski şifrenizle aynı olamaz ! Şifre oluşturulamadı. Lütfen tekrar deneyin.");
                   }else{
                       System.out.print("Şifreniz başarıyla oluşturuldu!");
                   }
                   break;
               case "H":
                   System.out.print("Yeni şifre oluşturmak istemediniz");
                   break;
               default:
                   System.out.println("Geçersiz işlem!");
                   break;
           }
        }else{
            System.out.print("Lütfen bilgilerinizi gözden geçiriniz.");
        }


    }
}
