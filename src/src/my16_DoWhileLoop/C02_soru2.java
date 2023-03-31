package src.my16_DoWhileLoop;

import java.util.Scanner;

public class C02_soru2 {
    public static void main(String[] args) {
    /* Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
               kontrol edin ve sifredeki hatalari yazdirin.
               Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
               sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
               - Sifre kucuk harf icermelidir
               - Sifre buyuk harf icermelidir
               - Sifre ozel karakter icermelidir
               - Sifre en az 8 karakter olmalidir.
 */
        Scanner scan = new Scanner(System.in);

        int flag = 0;
        int dogru = 0;

        do {
            System.out.println("Lutfen sifrenizi giriniz: ");
            String sifre = scan.nextLine();
            flag = 0;
            dogru=0;

            for (int i = 0; i < sifre.length(); i++) {
                if (((sifre.charAt(i)) <= 'z' && sifre.charAt(i) >= 'a')) {
                    flag++;
                }
            }
            if (flag > 0) {
                dogru++;
            } else {
                System.out.println("sifre kucuk harf icermelidir");

            }

            flag=0;
            for (int j = 0; j < sifre.length(); j++) {
                if (((sifre.charAt(j)) <= 'Z' && sifre.charAt(j) >= 'A')) {
                    flag++;
                }
            }
            if (flag > 0) {
                dogru++;
            } else {
                System.out.println("sifre buyuk harf icermelidir");

            }

            if ((sifre.length() >= 8)) {
                dogru++;
            } else if (sifre.length()<8){
                System.out.println("sifre 8 karakter icermelidir");
            }


        }while (dogru != 3) ;


        if (dogru == 3) {
            System.out.println("sifre kabul edilmistir");



        }
    }
    }



