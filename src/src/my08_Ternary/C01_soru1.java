package src.my08_Ternary;

import java.util.Scanner;

public class C01_soru1 {
    public static void main(String[] args) {
        /* if else deki basit islemleri daha basit bir formda yazar.
        ternary sadece deger döndurdugu icin ya yazdırmalı veya bir variable a atamalısınız.
         */
        // soru1:kullanıcıdan bir tamsayı isteyin;
        //       sayıyı kontrol edip 5 ile bolunebiliyorsa;
        //       "sayi 5 in tam katı" yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayı giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi%5==0 ? "sayi 5 in tam katı" :"sayi 5 in katı degil."); // sayıyı yazdırdık.




        }
}
