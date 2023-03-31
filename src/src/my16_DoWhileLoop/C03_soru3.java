package src.my16_DoWhileLoop;

import java.util.Scanner;

public class C03_soru3 {
    public static void main(String[] args) {
        /*

          Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
                  bulunuz, tamkare ise true değilse false yazdırınız.
                  Ornek : input : 16, output: 4

         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen tamkare olup olmadıgını merak ettiginiz pozitif bir tamsayi giriniz: ");
        int sayi = scan.nextInt();
        int i = 2;
        int flag = 0;
        while (i < sayi) {

            if (i*i==sayi) {
                flag++;
                break;
            } else {
                i++;
            }
        }
        if (flag == 0) {
            System.out.println("tamkare degildir.");
        } else if (flag == 1) {
            System.out.println("tamkaredir.");
        }
    }
}
