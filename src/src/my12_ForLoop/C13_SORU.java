package src.my12_ForLoop;

public class C13_SORU {
    public static void main(String[] args) {


    /*     SORU:   1-50 arasındaki sayılardan 3e, 5e ve 15e bölünenleri ayrı ayrı toplayan program kodunu yazınız.
                   (Not: 15e bölünüyorsa sayı sadece 15e bölünenlere eklenecek)
                */
       int uclerSayılarToplamı=0;
       int beslerSayılarToplamı=0;
       int onbeslerSayılarToplamı=0;



        for (int i =2; i < 50; i++) {
            if (i%15==0){
                onbeslerSayılarToplamı+=i;

            } else if (i%5==0) {
                beslerSayılarToplamı+=i;
            } else if (i%3==0) {
                uclerSayılarToplamı+=i;

            }

        }
        System.out.println("15 e bolunen sayıların toplamı: "+onbeslerSayılarToplamı);
        System.out.println("5 e bolunen sayıların toplamı: "+beslerSayılarToplamı);
        System.out.println("3 e bolunen sayıların toplamı: "+uclerSayılarToplamı);



    }}
