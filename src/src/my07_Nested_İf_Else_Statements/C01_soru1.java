package src.my07_Nested_İf_Else_Statements;

import java.util.Scanner;

public class C01_soru1 {
    public static void main(String[] args) {
         /*
        kullanıcıdan cinsiyetini ve yasını alın.kadın 60 yas ve uzeri, erkek 65 yas ve uzeri emekli olabilir.
        cinsiyet ve yasını dikkate alarak " Emekli olabilirsiniz" veya "Emekli olmak icin ... Yıl daha calışmalısınız"
        yazdırın.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi (kadın - erkek olarak) giriniz.");
        String cinsiyet=scan.next();
        System.out.println("Lutfen yasınızı giriniz.");
        double yas=scan.nextDouble();

        if (cinsiyet.equalsIgnoreCase("kadin")) {
            if (yas < 16 && yas > 80) {
            System.out.println("gecersiz yas girisi");}
            else if (yas < 60) {
            System.out.println("Emekli olabilmeniz icin " + (60 - yas) + " yıl daha calısmalısınız");}
            else {
                System.out.println("Emekli olabilirsiniz.");}
        }
        else if (cinsiyet.equalsIgnoreCase("erkek")) {
            if (yas < 16 && yas > 80) {
            System.out.println("gecersiz yas girisi");}
            else if (yas < 65) {
            System.out.println("Emekli olabilmeniz icin " + (65 - yas) + " yıl daha calısmalısınız");}
            else {
            System.out.println("Emekli olabilirsiniz.");}

        }
        else System.out.println("Gecersiz cinsiyet girisi");

    }}
