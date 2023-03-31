package src.my08_Ternary;

import java.util.Scanner;

public class C05_soru5 {
    public static void main(String[] args) {
        // kullanıcıdan iki sayı alın ve buyuk olmayan sayıyı yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tane tam sayı giriniz");
        int sayı1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println(sayı1>sayi2 ? sayi2: sayı1);
    }
}
