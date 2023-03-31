package src.my08_Ternary;

import java.util.Scanner;

public class C06_soru6 {
    public static void main(String[] args) {
        // kullanıcıdan bir tamsayı aldırın ve mutlak degerini yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayı giriniz.");
        int sayi=scan.nextInt();

        System.out.println(sayi<0 ? (-1)*sayi : sayi);
    }
}
