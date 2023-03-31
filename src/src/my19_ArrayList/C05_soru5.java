package src.my19_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_soru5 {
    public static void main(String[] args) {
        /*  Soru 5- Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
                    bir liste olarak bize donduren bir method olusturun.
         */

    SayidanKucukFibonacciListesi(5);




    }
    public static List<Integer> SayidanKucukFibonacciListesi(int sayi) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayi giriniz:  ");
        sayi = scan.nextInt();
        List<Integer> fibo = new ArrayList<>();

        fibo.add(0);
        fibo.add(1);
        for (int i = 2; i < sayi; i++) {
            fibo.add(fibo.get(i - 2) + fibo.get(i - 1));

        }
        System.out.println(fibo);

        return fibo;

    }


}
