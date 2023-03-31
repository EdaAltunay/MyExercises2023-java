package src.my06_İf_Else_Statements;

import java.util.Scanner;

public class C03_İfElseStatements_soru3 {
    public static void main(String[] args) {
        // kullanıcıdan yasını ısteyin,65 yas ve uzerı ise "Emekli olabilirsin"
        //yoksa emekli olması icin calısması gereken yıl sayısını yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasınızı giriniz");
        int yas=scan.nextInt();
        if (yas>=65)
            System.out.println("Emekli olabilirsin");
        else System.out.println("Emekli olabilmek icin "+(65-yas)+" yıl daha calısmalısınız");
    }
}
