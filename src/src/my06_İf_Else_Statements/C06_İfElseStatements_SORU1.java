package src.my06_İf_Else_Statements;

import java.util.Scanner;

public class C06_İfElseStatements_SORU1 {
    public static void main(String[] args) {
        /*
        kullanıcıdan cinsiyetini ve yasını alın.kadın 60 yas ve uzeri, erkek 65 yas ve uzeri emekli olabilir.
        cinsiyet ve yasını dikkate alarak " Emekli olabilirsiniz" veya "Emekli olmak icin ... Yıl daha calışmalısınız"
        yazdırın.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String cinsiyet=scan.nextLine();
        System.out.println("Lutfen yasınız giriniz");
        double yas=scan.nextDouble();
        if (yas<0 || yas>90) {
            System.out.println("girilen yas gecersiz");
        }
        else if (!(cinsiyet.equalsIgnoreCase("kadın") ||
                cinsiyet.equalsIgnoreCase("erkek")))
            System.out.println("Girilen cinsiyet gecersiz");
        else if (cinsiyet.equalsIgnoreCase("kadın")&& yas>=60) {
            System.out.println("Emekli olabilirsin");
        }
        else if (cinsiyet.equalsIgnoreCase("kadın")&& yas<60) {
            System.out.println("Emekli olmak icin "+(60-yas)+" yıl daha calısmalısınız.");
        } else if (cinsiyet.equalsIgnoreCase("erkek")&& yas>=65) {
            System.out.println("Emekli olabilirsiniz");

        } else if (cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
            System.out.println("Emekli olmak icin" +(65-yas)+" yıl daha calısmalısınız");

        }
    }

}
