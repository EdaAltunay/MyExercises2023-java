package src.my11_StringManipulation_02;

import java.util.Scanner;

public class C04_soru4 {
    public static void main(String[] args) {
        /*
      Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
               duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
               basariyla kaydedildi" yazdirin
              - ilk harf kucuk harf olmali
              - son karakter rakam olmali
              - sifre bosluk icermemeli
              - uzunlugu en az 10 karakter olmali
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz.");
        String sifre = scan.nextLine();
        int flag = 0;
        char sonharf=sifre.charAt(sifre.length()-1);

        if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
            flag++;
        } else {
            System.out.println("İlk karakter kucuk olmalı.");
        }
        if (sonharf >= '0' && sonharf <= '9') {
            flag++;
        } else {
            System.out.println("son karakter rakam olmalı");
        }
        if (!sifre.contains(" ")) {
            flag++;
        } else {
            System.out.println("Bosluk icermemeli");
        }
        if (sifre.length() >= 10) {
            flag++;
        } else {
            System.out.println("Uzunluk 10 karakterden az almamalı");

        } if (flag == 4) {
            System.out.println("sifre basariyla kaydedildi");
        }

}}

