package src.my12_ForLoop;

import java.util.Scanner;

public class C08_soru8_interview {
    public static void main(String[] args) {
        /* SORU8:   kullanıcıdan pozitif bir tamsyi alınız.1 den baslayarak tum tamsayiları yazdırın, sira;
                    3 ile bolunebilen bir sayıya gelirse sayı yerine "fizz",
                    5 ile bolunebilen bir sayıya gelirse sayı yerıne "buzz",
                    hem 3 hem de 5 ile bolunebilen bir sayıya denk gelirse sayi yerine "fizzBuzz" yazdırın.
                    */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayı giriniz:");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if (i % 15 == 0) {
                System.out.print(" fizzBuzz");
            } else if (i%5==0) {
                System.out.print(" buzz");

            } else if (i%3==0) {
                System.out.print(" fizz");

            }else System.out.print(" "+i);
        }


    }
}
