package src.my11_StringManipulation_02;

import java.util.Scanner;

public class FlagSorusu_SifreDegistirme {
    public static void main(String[] args) {
        /*      Soru 4 : Kullanicidan bir sifre isteyip,
                         asagidaki sartlari kontrol edin ve
                         kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
                         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
                         - ilk harf kucuk harf olmali
                         - son karakter rakam olmali
                         - sifre bosluk icermemeli
                         - uzunlugu en az 10 karakter olmali
                         soruyu if else ile yaparsak sadece 1 hata yazdirir, otekilere bakmaz
                         bagimsiz 4 if-else cumlesi olmali
                         en sonda 4 sarti'da sagladigini kontrol eden bir variable kullanacagiz */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz.");
        String sifre = scan.nextLine();
        int flag = 0;

        if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
            flag++;
        } else {
            System.out.println("Lutfen ilk harfi kucuk giriniz");
        }
        int sonharf = sifre.length() - 1;
        if (sifre.charAt(sonharf) >= '0' && sifre.charAt(sonharf) <= '9') {
            flag++;
        } else {
            System.out.println("Lutfen son harfi rakam giriniz");
        }
        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
        } else {
            flag++;
        }
        int uzunluk=sifre.length();
        if (uzunluk>=10){
            flag++;
        }
        else {
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmalı");
        }
        if (flag==4){
            System.out.println("Sifre basarıyla kaydedildi");
        }


    }
}
