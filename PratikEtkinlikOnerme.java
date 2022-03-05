package Uygulamalar;
import java.util.Scanner;

public class PratikEtkinlikOnerme {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık derecesi(C) : ");
        float degree=input.nextFloat();

        if(degree<5){
            System.out.print("Kayak yapabilirsiniz.");
        }
        else if(degree>=5 && degree<25){
            String cevap=degree<10 ? "Sinemaya gidebilirsiniz." : "Piknik yapabilirsiniz.";
            System.out.print(cevap);
        }else{
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }
}
