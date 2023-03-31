package src.my06_İf_Else_Statements;

import java.util.Scanner;

public class C08_İfElseStatements_SORU3 {
    public static void main(String[] args) {
        /*
        kullanıcıdan aldıgı urun adedı ve liste fiyatını alın, kullanıcıya musteri kartı olup olmadıgını sorun.
        Musteri kartı varsa 10 urunden fazla alırsa %20, daha az alırsa %15 indirim yapın.
        Musteri kartı yoksa 10 urunden fazla alırsa %15, daha az alırsa %10 indirim yapın.
         */
        Scanner scan=new Scanner(System.in);
       /*
        System.out.println("Lutfen aldığınız urun adedini giriniz.Daha sonra ENTER e basıp ürün liste fiyatını giriniz.");
        int  adet=scan.nextInt();
        double fiyat=scan.nextDouble();
        System.out.println("Lutfen musteri kartınızın olup olmadıgını 'evet' ve 'hayır' kelimeleri ile giriniz. ");
        String kart=scan.next();
        if (kart.equalsIgnoreCase("evet") && adet>10){
        System.out.println("Urununuzun %20 indirimli fiyatı: "+ (fiyat*80)/100);
        } else if (kart.equalsIgnoreCase("evet") && adet<10) {
        System.out.println("Urununuzun %15 indirimli fiyatı: "+ (fiyat*75)/100);
        }
        if (kart.equalsIgnoreCase("hayır") && adet>10){
            System.out.println("Urununuzun %15 indirimli fiyatı: "+ (fiyat*75)/100);
        } else if (kart.equalsIgnoreCase("hayır") && adet<10) {
            System.out.println("Urununuzun %10 indirimli fiyatı: "+ (fiyat*90)/100);
            }
      */

        System.out.println("Lutfen musteri kartınızın olup olmadıgını 'evet' ve 'hayır' kelimeleri ile giriniz. ");
        String kart=scan.next();

        System.out.println("Lutfen aldığınız urun adedini giriniz.Daha sonra ENTER e basıp ürün liste fiyatını giriniz.");
        int  adet=scan.nextInt();
        double fiyat=scan.nextDouble();


        if (kart.equalsIgnoreCase("evet")) {
            if (adet>10) {System.out.println("Urununuzun %20 indirimli fiyatı: " + fiyat*0.8);}
            else{ System.out.println("Urununuzun %15 indirimli fiyatı: "+ fiyat*0.75);}

            }
        else if (kart.equalsIgnoreCase("hayır")){
            if (adet>10) {System.out.println("Urununuzun %15 indirimli fiyatı: "+ fiyat*0.75);}
            else{ System.out.println("Urununuzun %10 indirimli fiyatı: "+ fiyat*0.9);}

        }else {
            System.out.println("yanlıs giris yaptınız");
        }



    }
}
