package src.my05_İf_Statements;

import java.util.Scanner;

public class C05_İf_Statements_soru5 {
    public static void main(String[] args) {
        // kullanıcıdan notunu alın 50 veya daha buyukse "Sınıfı gectin";
        // 50 den kucukse "Maalesef kaldın" yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();
        if (not>=50)                          /// eger if sonucun tek satıra sıgıyorsa {} ' e gerek yok.
            System.out.println("Sınıfı gectin");
        if (not<50)
            System.out.println("Maalesef kaldın");

    }
}
