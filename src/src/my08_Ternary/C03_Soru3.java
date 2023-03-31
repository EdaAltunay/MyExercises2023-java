package src.my08_Ternary;

import java.util.Scanner;

public class C03_Soru3 {
    public static void main(String[] args) {
        // soru3:kullanıcıdan bir harf isteyin,
        //       girilen karakter kucuk harf ise onu buyuk harf olarak yazdırın.
        //       yoksa girilen harfi yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        System.out.println(harf>='a' && harf<='z' ? Character.toUpperCase(harf) : harf );





    }
}
