package src.my03_Scannerr;

import java.util.Scanner;

public class Scanner_soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String Kullaniciİsmi = scan.next();
        System.out.println("İsminiz " + Kullaniciİsmi);

        System.out.println("Lutfen soyisminizi giriniz");
        String KullaniciSoyİsmi = scan.next();
        System.out.println("Soyisminiz " + KullaniciSoyİsmi);

        System.out.println("lutfen yasinizi giriniz");
        int kullaniciYasi = scan.nextInt();
        System.out.println("Yasiniz "+ kullaniciYasi);

        System.out.println("KAYDİNİZ BASARİYLA TAMAMLANMİSTİR.");




    }

    }

