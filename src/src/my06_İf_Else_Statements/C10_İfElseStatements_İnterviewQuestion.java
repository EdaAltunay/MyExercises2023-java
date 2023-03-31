package src.my06_İf_Else_Statements;

import java.util.Scanner;

public class C10_İfElseStatements_İnterviewQuestion {
    public static void main(String[] args) {
        /* kullanıcıdan artık yıl olup olmadıgını kontrol etmek icin yıl girmesini isteyin.
        kural1: 4 ile bolunemeyen yıllar artık yıl degildir.
        kural2: 4 ile bolunup, 100 ile bolunemeyen yıllar artık yıldır.
        kural3: 4 ' un katı olmasına regmen 100 ile bolunebilen yıllardan sadece 400' un katı olan yıllar artık yıldır.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yıl giriniz.");
        int yil=scan.nextInt();

        if (!(yil%4==00)){
            System.out.println("Girilen yıl artık yıl degildir.");

        } else if (!(yil%100==0)) {
            System.out.println("Girilen yıl artık yıldır.");
        } else if (!(yil%400==0)) {
            System.out.println("Girilen yıl artık yıl degildir.");
        }
          else {
            System.out.println("Girilen yıl artık yıldır.");

        }
    }
}
