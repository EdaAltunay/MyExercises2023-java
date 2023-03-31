package src.my15_WhileLoop;

import java.util.Scanner;

public class C01_ {
    public static void main(String[] args) {
         /*  SORU : kullanıcıdan bir sifre isteyin asagıdaki sartları saglayana kadar herseferinde hataları soyleyip yeni sifre isteyip
                   sartları saglayan sifre oldugunda  " 5. denemenizde basarılı sifre olusturuldu" seklinde acıklama yazın.
                   sartlar:
                   -ilk harf kucuk harf olmalı
                   -son harf buyuk olmalı
                   -bosluk icermemeli
                   -8 karakter veya daha uzun olmalı


         */

        Scanner scan = new Scanner(System.in);
        int flag = 0;
        String sifre = "";
        int denemeayisi = 0;

        while (flag != 4) {
            flag = 0;
            System.out.print("Lutfen sifrenizi giriniz: ");
            sifre = scan.nextLine();
            if ( sifre.charAt(0)>='a' && sifre.charAt(0) <= 'z') {
                flag++;

            } else {
                System.out.println("Sifrenizin ilk harfi kucuk olmalı");

            }
            if (sifre.charAt(sifre.length() - 1) >= 'A' && sifre.charAt(sifre.length() - 1) <= 'Z') {
                flag++;
            } else {
                System.out.println("Sifrenizin son karakteri buyuk olmali");
            }
            if (!sifre.contains(" ")) {
                flag++;
            } else {
                System.out.println("Sifreniz bosluk icermemeli");
            }
            if (sifre.length() >= 8) {
                flag++;
            } else {
                System.out.println("Sifreniz en az sekiz karakter icermeli");
            }
            denemeayisi++;

        }
        System.out.println(denemeayisi+" . denemizde basarili sifre olusturuldu");


    }
}
