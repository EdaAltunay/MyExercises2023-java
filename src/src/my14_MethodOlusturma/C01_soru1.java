package src.my14_MethodOlusturma;

import java.util.Scanner;

public class C01_soru1 {
    public static void main(String[] args) {
        /*
            Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
                   baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
                   bir method olusturun.
                   - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
                   mesaji verin
                   - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
                   yazdirin.
         */


   aradakiHarfleriYazdirma();




    }

    public static void aradakiHarfleriYazdirma() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen bir string giriniz: ");
        String input = scan.nextLine();


        System.out.print("Lutfen girdiginiz input'un yazdirmak istediginiz kisminin baslangic indexsini giriniz: ");
        int index1 = scan.nextInt();

        System.out.print("Lutfen girdiginiz input'un yazdirmak istediginiz kisminin bitis indexsini giriniz: ");
        int index2 = scan.nextInt();

        if (index1 > index2) {
            System.out.println("Hatali giris yaptiniz.Baslangic index'i bitis indexinden büyük olamaz");
        }

        if (index1 > input.length() - 1) {
            System.out.println("Hatali giris yaptiniz.Baslangic index degeriniz input un index degerlerinden daha buyuk olamaz. ");
        }

        if (index2 > input.length() - 1) {
            System.out.println("Hatali giris yaptiniz.Bitis index degeriniz input un index degerlerinden daha buyuk olamaz. ");
        } else {
            System.out.println(input.substring(index1, index2));
        }

    }


}