package src.my07_Nested_İf_Else_Statements;

import java.util.Scanner;

public class C02_soru1_ikinciYol {
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

        if (yas<16 && yas>80){
            System.out.println("Gecersiz yas  girisi");}
        else if (yas<60) {
            if (cinsiyet.equalsIgnoreCase("kadın")){
                System.out.println("Emekli olmak icin "+ (60-yas)+ " yıl daha calısmalısınız ");}
            else if (cinsiyet.equalsIgnoreCase("Erkek")){
                System.out.println("Emekli olmabilmek icin "+(65-yas)+" yıl daha calısmalısınız");}
            else {
                System.out.println("gecersiz cinsiyet girisi");
             } }
        else if (yas<65) {
            if (cinsiyet.equalsIgnoreCase("kadın")){
                System.out.println("Emekli olabilirsiniz");}
            else if (cinsiyet.equalsIgnoreCase("Erkek")){
                System.out.println("emekli olmak icin " +(65-yas)+" yıl daha calısmalısınız");}
            else {
                System.out.println("Gecersiz cinsiyet girisi");}
        }
        else {
            if (cinsiyet.equalsIgnoreCase("kadın")|| cinsiyet.equalsIgnoreCase("erkek")){
                System.out.println("Emekli olabilirsin");}
            else {System.out.println("Emekli olabilirsin");}}

        }}
