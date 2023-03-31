package src.my14_MethodOlusturma;

import java.util.Scanner;

public class C04_soru4 {
    public static void main(String[] args) {
        /*  Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
                    bolenleri sayisini bulup bize donduren bir method olusturun
         */

        //Scanner scan = new Scanner(System.in);
        //System.out.print("Lutfen pozitif bölenlerinin sayisini ögrenmek istediginiz bir tamsayi giriniz: ");
        //int sayi = scan.nextInt();

        System.out.println(pozitifBölenSayisiBulma());



    };
    public static int pozitifBölenSayisiBulma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozitif bölenlerinin sayisini ögrenmek istediginiz bir tamsayi giriniz: ");
        int sayi = scan.nextInt();
        int flag = 0;
        int pozitifBölenSayisi;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                flag++;
            }
        }
        pozitifBölenSayisi=flag;

return pozitifBölenSayisi;
    }


}










