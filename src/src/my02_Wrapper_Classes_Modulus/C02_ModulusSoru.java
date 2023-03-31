package src.my02_Wrapper_Classes_Modulus;

import java.util.Scanner;

public class C02_ModulusSoru {
    public static void main(String[] args) {

        // kullanıcıdan dort basamaklı bir sayi alıp rakamlar toplamını bulalım. sayi:abcd olsun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir sayi giriniz");
        int sayi= scan.nextInt();   // abcd
        int x=sayi%10;  // d dir.
        int y=sayi/10;  // abc dir.
        int z=y%10;     // c dir.
        int t=y/10;     // ab dir.
        int m=t%10;     //  b dir.
        int n=m%10;     // a dır.
        System.out.println("Girilen sayinin rakamlar toplamı : " +( x+z+m+n));

        //////////////////////////////////////   İKİNCİ YOL;////////////////////////////

        System.out.println("lutfen dört basamakli bir sayi giriniz."); //// 1234 olsun
        int sayi2=scan.nextInt();  ///1234
        int sonbasamak=sayi2%10;   /// 4 olur
        int rakamlarToplamı= sonbasamak;  /// rakamlar toplamı: 4 tur suan icin.

        sayi2 = sayi2/10;    /// 123 olur.
        sonbasamak = sayi2%10;  /// 3 olur
        rakamlarToplamı=rakamlarToplamı + sonbasamak;  /// 4+3 olur.

        sayi2=sayi2/10;  /// 12 olur.
        sonbasamak = sayi2%10; //////  2 olur.
        rakamlarToplamı=rakamlarToplamı+ sonbasamak;   //// 4+3+2 lur.

        sayi2=sayi2/10;  ////  1 olur.
        sonbasamak =sayi2%10;
        rakamlarToplamı=rakamlarToplamı+sonbasamak;

        System.out.println("Girilrn sayinin rakamlar toplamı= " +rakamlarToplamı);



    }
}
