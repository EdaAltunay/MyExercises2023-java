package src.my10_String_Manipulations_01;

import java.util.Scanner;

public class C05_soru2_İndex_Of {
    public static void main(String[] args) {
        /*    Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
                       icerisinde kullanimini(indexof ile) kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
                       - String aranan metni icermiyor
                       - Aranan metin String’de sadece 1 kere kullanilmis
                       - Aranan metin String’de sadece 1’den fazla kullanilmis
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz." +
                "\nArdından enter e basıp;metnin icinde aranılacak kelimeyi giriniz  ");
        String metin = scan.nextLine();
        String aranacakKelime = scan.nextLine();

        if (metin.indexOf(aranacakKelime) == (-1)) {  // aranılan kelime hic kullanılmamıs.
            System.out.println("Metin aranılacak kelimeyi icermiyor");
        } else {                                   // o halde aranılan kelime kullanılmıs yani.
            int kelimeilkindex = metin.indexOf(aranacakKelime);
            if (metin.indexOf(aranacakKelime, (kelimeilkindex + 1)) == (-1)) {      /// aranılan kelime bir kere kullanılmıs
                System.out.println("Aranan kelime metinde 1 kere kullanılmıs");
            } else {
                System.out.println("Aranılan kelime metinde 1 den fazla kullanılmıs.");

            }
            kelimeilkindex = kelimeilkindex + 1;

        }


    }
}

