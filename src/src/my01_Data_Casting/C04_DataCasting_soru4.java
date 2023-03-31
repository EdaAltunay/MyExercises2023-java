package src.my01_Data_Casting;

import java.util.Scanner;

public class C04_DataCasting_soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pespese iki sayiyi aralarında ENTER e basarak giriniz.");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        int sayi3= (int)sayi1/(int)sayi2;
        System.out.println("girilen ilk sayinin ikinci sayiya bolumunun tamsayi degeri:"+sayi3);
        System.out.println("girilen ilk sayinin ikinci sayiya bolumunun tamsayi degeri:" +(int)(sayi1/sayi2));
    }
}
