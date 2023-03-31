package src.my03_Scannerr;

import java.util.Scanner;

public class Scanner_soru2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi1 = scan.nextDouble();

        System.out.println("lutfen bir sayi daha giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("Sayilerin toplamı= " + (sayi1+sayi2));
        System.out.println("sayilerin carpimi= " + sayi1*sayi2);


    }
}
