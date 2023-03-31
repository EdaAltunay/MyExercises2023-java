package src.my12_ForLoop;

import java.util.Scanner;

public class C11_soru11 {
    public static void main(String[] args) {
        /*
        SORU11: kullanıcıdan pozıtıf bır tamsayı isteyip, sayının asal sayı olup olmadıgını kontrol edin ve sonucu yazdırın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozıtıf bir tamsayı giriniz: ");
        int sayi = scan.nextInt();
        int flag = 0;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i != 0) {
                flag++;
            }
        }
        if (flag==sayi-2){
            System.out.println("SAYİ ASAL SAYİDİR");
        } else if (flag<sayi-2 || sayi==1) {
            System.out.println("SAYİ ASAL SAYİ DEGİLDİR");

        }else {
            System.out.println("yanlıs giris yaptınız");



    }
}}
