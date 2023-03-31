package src.my06_İf_Else_Statements;

import java.util.Scanner;

public class C04_İfElseStatements_soru4 {
    public static void main(String[] args) {
        // kullanıcıdan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadıgını yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);
        if (karakter>=65 && karakter<=90)
            System.out.println("Girilen karakter buyuk harftir.");
        else System.out.println("Girilen karakter buyuk harf degildir.");
    }
}
