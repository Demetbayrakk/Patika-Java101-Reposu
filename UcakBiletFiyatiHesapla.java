package Uygulamalar;
import java.util.Scanner;

public class UcakBiletFiyatiHesapla {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Kullanıcıdan alınacak bilgiler;
        int km,yas,yolculukTipi;
        float normalTutar,yasIndirimi,tipIndirimi,indirimliTutar;

        System.out.print("Gideceğiniz mesafeyi km cinsinden giriniz : ");
        km=input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas=input.nextInt();
        System.out.print("1-Tek Yön \n2-Gidiş-Dönüş \n\nYolculuk Tipini Seçiniz : ");
        yolculukTipi=input.nextInt();

        if(km>0 && yas>0 && (yolculukTipi==1 || yolculukTipi==2)){
            normalTutar=km*0.10f;
            if(yas<12){
            yasIndirimi=normalTutar*0.5f;
            }
            else if(yas>=12 && yas<=24 ){
            yasIndirimi=normalTutar*0.10f;
            }else if(yas>65){
                yasIndirimi=normalTutar*0.3f;
            }else{
                yasIndirimi=0;
            }
            indirimliTutar=normalTutar-yasIndirimi;

            if(yolculukTipi==2){
                tipIndirimi=indirimliTutar*0.2f;
            }else{
                tipIndirimi=0;
            }
            indirimliTutar=indirimliTutar-tipIndirimi;
            System.out.print("Bilet normal fiyatı : "+normalTutar+"\nYaş indirim tutarı : "+yasIndirimi+"\nYolculuk Tipi İndirimi : "
                    +tipIndirimi+"\nİndirimli Bilet Fiyatınız : "+indirimliTutar);

        }else{
            System.out.print("Hatalı veri girdiniz!");
        }


    }
}
