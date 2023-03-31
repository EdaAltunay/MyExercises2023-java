package src.my12_ForLoop;

import java.util.Scanner;

public class C02_soru2 {
    public static void main(String[] args) {
        // soru2 : kullanıcıdan pozitif bir tamsayi alın,1 den girilen sayıya kadar(sayı harıc)
        //         7 ile bolunebilen sayılarıyanyana yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozıtıf bir tamsayı giriniz.");
        int sayi=scan.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }

        }
    }
}
