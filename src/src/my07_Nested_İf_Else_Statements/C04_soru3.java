package src.my07_Nested_İf_Else_Statements;

import java.util.Scanner;

public class C04_soru3 {
    public static void main(String[] args) {
        /*
         kullanıcıdan bir sayi alın.
         sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin.
         sayi cift sayi ise 10 un tam katı olup olmadıgını yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (!(sayi%2==0)){
            if (sayi<0){
                System.out.println("Negatif tek sayi");}
            else if (sayi>0) {
                System.out.println("Pozitif tek sayi");}
            else {
                System.out.println("Gecersiz giris yaptınız");}
        }
        else if (sayi%2==0) {
            if (sayi%10==0){
                System.out.println("Sayi 10 un katidir.");}
            else if (!(sayi%10==0)) {
                System.out.println("Sayi 10 un katı degildir.");}
            else {
                System.out.println("Gecersiz giris yaptınız");}
        }
        else {
            System.out.println("Gecersiz giris yaptınız.");
        }


    }
}
