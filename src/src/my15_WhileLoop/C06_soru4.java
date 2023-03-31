package src.my15_WhileLoop;

import java.util.Scanner;

public class C06_soru4 {
    public static void main(String[] args) {
        /*Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin,
                  Kullaniciya bitirmek istediginde 0'a basmasini soyleyin.
                  Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
                  ve bunlarin toplaminin kac oldugunu yazdirin.
                  Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
                  bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */

        Scanner scan = new Scanner(System.in);
        int sayi=1;
        int sayiAdedi = 0;
        int toplam = 0;
        while (sayi != 0) {
            System.out.println("Toplanmak uzere tamsayi giriniz" +
                    "\nBitirmek icin 0'a basiniz");
            sayi = scan.nextInt();
            if (sayi<0){
                System.out.println("Negatif sayi kullanamazsiniz.");

            }
            else if (sayi != 0) {
                toplam+=sayi;
                sayiAdedi++;

            }
        }
        System.out.println("Girilen "+sayiAdedi+" adet sayinin toplami= "+toplam);


    }
}
