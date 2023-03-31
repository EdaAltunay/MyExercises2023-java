package src.my15_WhileLoop;

import java.util.Scanner;

public class C02_ {
    public static void main(String[] args) {
        /*SORU:
              Kullanicidan toplanmak uzere sayilar alin
              toplam 500 olursa veya 500'u gecerse
              kac sayi girdigini ve sayilarin toplamini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int adet=0;
        while (toplam<=500){

            System.out.print("Lutfen toplanmak uzere sayilar giriniz: ");
            int sayi= scan.nextInt();
            toplam+=sayi;
            adet++;

        }
        System.out.println("Girilen "+adet+" sayinin toplami = "+toplam);


    }
}
