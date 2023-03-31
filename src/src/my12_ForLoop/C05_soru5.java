package src.my12_ForLoop;

import java.util.Scanner;

public class C05_soru5 {
    public static void main(String[] args) {
        /* soru5:  kullanıcıdan 20 den kucuk bir sayı alıp,bu sayının faktorıyel degerını hesaplayınız.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 20 den kucuk bir tamsayı gırınız.");
        int sayi= scan.nextInt();
        int faktoriyel=1;
        for (int i =1; i <=sayi ; i++) {
            faktoriyel *= i;
        }
        System.out.println(sayi+"!"+faktoriyel);

    }
}
