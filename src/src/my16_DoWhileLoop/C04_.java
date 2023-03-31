package src.my16_DoWhileLoop;

import java.util.Scanner;

public class C04_ {
    public static void main(String[] args) {
        /*
        SORU:  Kullanicidan toplanmak uzere sayilar alin
               kullaniciya bitirmek icin 0'a basmasini soyleyin
               kullanici 0'a bastiginda
               0 haric kac sayi girildigini ve toplamlarini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int sayiAdedi=0;
        int toplam=0;

         do {
             System.out.println("Lutfen toplanmak uzere sayilar giriniz :"+
                     "\nBitirmek istediginizde sifir' a basiniz. ");
             sayi=scan.nextInt();

             if (sayi!=0){
                 toplam+=sayi;
                 sayiAdedi++;
             }
         }
         while (sayi!=0);
            System.out.println("Girilen " + sayiAdedi + " adet sayinin toplami :" + toplam);
        }


    }

