package src.my01_Data_Casting;

import java.util.Scanner;

public class C03_DataCasting_soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        double sayi=scan.nextDouble();
        System.out.println("girilen sayinin byte degeri: "+ (byte)(sayi));
    }
}
