package src.my15_WhileLoop;

import java.util.Scanner;

public class C04_soru2 {
    public static void main(String[] args) {
        /*
       Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

         */

        Scanner scanne=new Scanner(System.in);
        System.out.print("Lutfen rakamları toplanacak pozitif bir tamsayi giriniz:");
        int sayi= scanne.nextInt();


        int rakamlarToplam=0;
        int birlerBasamagı=0;
        while (sayi>0){
            birlerBasamagı=sayi%10;
            rakamlarToplam+=birlerBasamagı;
            sayi=sayi/10;
        }
        System.out.println("Girdiginiz sayinin rakamlar toplamı: "+ rakamlarToplam);






    }
}
