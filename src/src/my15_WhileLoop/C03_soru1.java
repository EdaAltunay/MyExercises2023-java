package src.my15_WhileLoop;

public class C03_soru1 {
    public static void main(String[] args) {
        /*
        Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
                yazdirin.

         */


       int sayi=10;
       int toplam=0;
       String sayilar="";

       while (sayi<=99){
           if (sayi%7==0){
               toplam+=sayi;
               sayilar+=sayi+",";
           }
           sayi++;
       }
        System.out.println("2 basamaklı 7 ile bölünebilen sayılar:"+sayilar.substring(0,sayilar.length()-1));
        System.out.println("2 basamaklı 7 ile bölünebilen sayilar toplami: "+toplam);


    }


}
