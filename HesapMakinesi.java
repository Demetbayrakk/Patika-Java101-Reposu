package Uygulamalar;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int number1,number2,select;

        Scanner input=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        number1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        number2=input.nextInt();
        System.out.println("Yapmak istediğiniz işlemin numarasını giriniz : \n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select=input.nextInt();
        switch (select){
            case 1:
                System.out.print(number1+"+"+number2+"="+(number1+number2));
                break;
            case 2:
                System.out.print(number1+"-"+number2+"="+(number1-number2));
                break;
            case 3:
                System.out.print(number1+"x"+number2+"="+(number1*number2));
                break;
            case 4:
                System.out.print(number1+"/"+number2+"="+(number1/number2));
                break;
            default:
                System.out.print("Geçersiz seçim!");
                break;

        }

    }
}
