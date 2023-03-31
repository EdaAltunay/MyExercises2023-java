package src.my03_Scannerr;

import java.util.Scanner;

public class Scanner_soru8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen tamsayi olan iki sayi giriniz" +
                "\nLutfen her bir tamsayidan sonra ENTER e basiniz.");
        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();


        System.out.println("Sayi1'in yeni degeri : " + sayi2);
        System.out.println("Sayi2'in yeni degeri : " + sayi1);
    }
}
