package src.my15_WhileLoop;

import java.util.Scanner;

public class C07_soru5 {
    public static void main(String[] args) {
        /*

         Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
                 kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
                 olusturun
         */


        kuvvetBulma();
    }
    public static void kuvvetBulma(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen taban olcak bir sayi giriniz :");
        int taban=scan.nextInt();
        System.out.print("Lutfen taban a üs olcak sayiyi giriniz: ");
        int us= scan.nextInt();

        int kuvvet=1;
        int i=1;
        while (i<=us){

            kuvvet*=taban;
            i++;
        }
            System.out.println(taban+ " ussu "+us+" = "+kuvvet);








    }

}
