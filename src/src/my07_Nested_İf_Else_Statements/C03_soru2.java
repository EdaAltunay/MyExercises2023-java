package src.my07_Nested_İf_Else_Statements;

import java.util.Scanner;

public class C03_soru2 {
    public static void main(String[] args) {

        /*
         kullanıcıdan aldıgı urun adedı ve liste fiyatını alın,
         kullanıcıya musteri kartı olup olmadıgını sorun.
         Musteri kartı varsa 10 urunden fazla alırsa %20, daha az alırsa %15 indirim yapın.
         Musteri kartı yoksa 10 urunden fazla alırsa %15, daha az alırsa %10 indirim yapın.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen musteri kartınızın olup olmadıgını(evet ya da hayır yazarak) giriniz");
        String kart=scan.next();
        System.out.println("Lutfen aldıgınız urun adedini giriniz.");
        int adet=scan.nextInt();
        System.out.println("Lutfen aldıgınız urunun liste fiyatını giriniz.");
        double fiyat=scan.nextDouble();

        if (kart.equalsIgnoreCase("evet")){
            if (adet>10){
                System.out.println("Urununuzun %20 indirimli fiyatı: "+(fiyat*80/100));}
            else if (adet<=10){
                System.out.println("Urununuzun %15 indirimli fiyatı: "+(fiyat*75/100));}
            else {
                System.out.println("gecersiz urun adedi girdiniz");}
        }
        else if (kart.equalsIgnoreCase("hayır")){
            if (adet>10){
            System.out.println("Urununuzun %15 indirimli fiyatı: "+(fiyat*75/100));}
            else if (adet<=10){
            System.out.println("Urununuzun %10 indirimli fiyatı: "+(fiyat*90/100));}
            else {
            System.out.println("gecersiz urun adedi girdiniz");}
        }
        else {
            System.out.println("Gecersiz kart girisi yaptınız.");
        }





    }
}
