package src.my12_ForLoop;

import java.util.Scanner;

public class C03_Soru3 {
    public static void main(String[] args) {
        /*
        soru3: kullanıcıdan baslangıc ve bıtıs degeri olarak pozitif sayılar alın.
               sınırlar dahil olarak aralarındakı tum sayıların toplamını yazdırın.
               Bıtıs degeri baslangıc degerınden kucukse uyarı yazdırıp ıslemı sonlandırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslanıgız degerını giriniz. ");
        int baslangıc= scan.nextInt();
        System.out.println("lutfen bıtıs degrını gırınız");
        int bitis=scan.nextInt();
        int sayılarToplamı=0;

       if (bitis<baslangıc){
           System.out.println("UYARI: bitis degri baslangıc degerınden kucuk olamaz!");
       }
       else {
           for (int i = baslangıc; i <=bitis ; i++) {
               sayılarToplamı +=i;

           }
       }
        System.out.println("Sayılar toplamı: "+sayılarToplamı);
    }
}
