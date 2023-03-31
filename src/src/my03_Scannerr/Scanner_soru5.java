package src.my03_Scannerr;

import java.util.Scanner;

public class Scanner_soru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi girin");
        String kullaniciİsmi= scan.nextLine();

        System.out.println("lutfen soyisminizi giriniz");
        String kullaniciSoyismi= scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");
        int kullaniciyasi= scan.nextInt();

        System.out.println("girilen bilgiler:" + kullaniciİsmi.charAt(0) + " "  + kullaniciSoyismi + "," + kullaniciyasi);

    }
    }

