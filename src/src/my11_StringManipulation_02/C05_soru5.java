package src.my11_StringManipulation_02;

import java.util.Scanner;

public class C05_soru5 {
    public static void main(String[] args) {
        /*
        Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
                - ismi daha uzun ise, isim ve soyismi ilk harf buyuk, kalanlar kucuk seklinde yazdirin...// Eda Altunay
                - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
                harflerle yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen adınızı giriniz: ");
        String isim = scan.nextLine();
        System.out.print("Lutfen soyisminizi giriniz.");
        String soyisim = scan.nextLine();

        String str1 = isim.substring(0, 1).toUpperCase()+ isim.substring(1).toLowerCase();
        String str2 = soyisim.substring(0, 1).toLowerCase() + soyisim.substring(1).toUpperCase();
        String str3 = soyisim.toUpperCase();

        int isimKarakterSayisi = isim.length();
        int soyisimKarakterSayisi = soyisim.length();

        if (isimKarakterSayisi > soyisimKarakterSayisi) {
            System.out.println(str1 + " " + str2);
        } else {
            System.out.println(str1 +str3);

        }


    }
}
