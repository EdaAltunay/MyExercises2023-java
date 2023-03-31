package src.my14_MethodOlusturma;

import java.util.Scanner;

public class C03_soru3 {
    public static void main(String[] args) {
        /*
              Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
                      Girilen sayinin asal sayi olup olmadigini kontrol edip,
                      sonuc olarak “asal sayi” veya “asal sayi degil”
                      sonuclarini donduren bir method olusturun.
         */
        /*
        parametreli method ile calisiyorsaniz eger parametre girmeniz gerekir aksi halde method calismaz.
        Soruda kullanicidan alin dedigi degeri main icinde alip onu methoda parametre olarak girebilirsiniz.
        eger method icinde scanner calisacaksa o methodu parametresiz method yapmaniz gerekir cunku parametresini kendisi uretiyor
         */

     //   Scanner scan = new Scanner(System.in);
       // System.out.print("lutfen asalligini merak ettiginiz bir sayi giriniz: ");
        //int sayi = scan.nextInt();


        System.out.println(asalMi());


    }
    ////   parametreli girdigimiz methoddur. genellikle boylesi daha cok tercih edilir.

  // public static String asalMi(int sayi) {


  //     int flag = 0;
  //     String sonuc = "";
  //     for (int i = 2; i < sayi; i++) {
  //         if (sayi % i == 0) {
  //             flag++;
  //             break;
  //         }
  //     }
  //     if (flag == 1 || sayi == 1) {
  //         sonuc = "ASAL SAYİ DEGİLDİR";
  //     } else if (flag == 0 || sayi == 2) {
  //         sonuc = "ASAL SAYİDİR.";
  //     }
  //     return sonuc;
  // }


    /////   parametresiz olarak olusturdugumuz methoddur.

     public static String asalMi() {
     Scanner scan = new Scanner(System.in);
     System.out.print("Lutfen asal olup olmadıgını merak ettiginiz pozitif tamsayiyi giriniz: ");
     int girilenSayi = scan.nextInt();
     int flag = 0;
     String sonuc = "";
     for (int i = 2; i < girilenSayi; i++) {
         if (girilenSayi % i == 0) {
             flag++;
             break;
         }
     }
     if (flag == 1 || girilenSayi == 1) {
         sonuc = "ASAL SAYİ DEGİLDİR.";
     } else if (flag == 0 || girilenSayi == 2) {
         sonuc = "ASAL SAYİDİR.";
     }
     return sonuc;
     }
}









