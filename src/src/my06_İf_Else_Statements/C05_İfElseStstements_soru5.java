package src.my06_İf_Else_Statements;

import java.util.Scanner;

public class C05_İfElseStstements_soru5 {
    public static void main(String[] args) {
        // kullanıcıdan bir karakter isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdırın
        // yoksa girilen karakteri yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);
        if (karakter>=97 && karakter<=122)
            System.out.println(Character.toUpperCase(karakter));
        else System.out.println(karakter);
    }
}
