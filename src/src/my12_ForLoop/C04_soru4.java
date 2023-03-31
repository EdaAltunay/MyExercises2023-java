package src.my12_ForLoop;

import java.util.Scanner;

public class C04_soru4 {
    public static void main(String[] args) {
         /*
          soru4:kullanıcıdan baslangıc ve bıtıs degeri olarak pozitif sayılar alın.
                sınırlar dahil olarak aralarındakı tum sayıların toplamını yazdırın.
                Bitis degeri baslangıc degerınden kucuk olsa da program calıssın     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangıc degerını giriniz.");
        int baslangıc = scan.nextInt();
        System.out.println("Lutfen bıtıs degerını gırınız.");
        int bitis = scan.nextInt();
        int sayılarToplami = 0;

        if (baslangıc <= bitis) {
            for (int i = baslangıc; i <= bitis; i++) {

                sayılarToplami += i;
            }
        } else {                                         // bitis<baslangıc dır.
            for (int i = baslangıc; i >= bitis; i--) {

                sayılarToplami += i;
            }
        }
        System.out.println("Sayilar toplami: " + sayılarToplami);
    }
}








