package src.my10_String_Manipulations_01;

import java.util.Scanner;

public class C08_grup_extra_soru {
    public static void main(String[] args) {
        /*  TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.
            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.
            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.
            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.
            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ehliyetinizin olup olmadıgını evet/hayır ile giriniz.");
        String ehliyet=scan.next();
        System.out.println("Lutfen aracınıızn hızını giriniz.");
        double hiz=scan.nextDouble();

        if (ehliyet.equalsIgnoreCase("evet")){}
        else if (ehliyet.equalsIgnoreCase("hayır")) {}
        else {
            System.out.println("yanlıs giris yaptınız");
        }


    }

}
