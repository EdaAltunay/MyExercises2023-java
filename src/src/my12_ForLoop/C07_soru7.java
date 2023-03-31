package src.my12_ForLoop;

import java.util.Scanner;

public class C07_soru7 {
    public static void main(String[] args) {
        /*soru7: kullanıcıdan pozitif bir tamsayı alıp rakamlar toplamını yazdırın.

        int sayı 10 basamaklı, long sayı 19 basamaklıdır.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz.");
        long sayi = scan.nextLong();     /// abcde..
        long sonbasamak = sayi % 10;// son basamak: e dir
        long rakamlarToplamı = sonbasamak;     // rakamalarToplamı: e    simdilik.


        for (long i = 1; i <= 100; i++) {
            // i<? de sayının kac basamaklı oldugunu bılmedıgım ıcın 100 dedim. o zaten sayı bıtınce duracaktır.

            sayi = sayi / 10;   // yeni sayı: abcd;
            sonbasamak = sayi % 10;
            rakamlarToplamı = rakamlarToplamı + sonbasamak;


        }
        System.out.println("Sayinin rakamlar toplamı: " + rakamlarToplamı);


    }
}
