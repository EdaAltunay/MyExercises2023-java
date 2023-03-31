package src.my10_String_Manipulations_01;

import java.util.Scanner;

public class C07_soru2_Last_İndex {
    public static void main(String[] args) {
         /*    Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
                       icerisinde kullanimini(Lastindexof ile) kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
                       - String aranan metni icermiyor
                       - Aranan metin String’de sadece 1 kere kullanilmis
                       - Aranan metin String’de sadece 1’den fazla kullanilmis
         */



        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz." +
                "\nArdından enter e basıp;metnin icinde aramamızı istediginiz kelimeyi giriniz  ");
        String metin=scan.nextLine();
        String aranacakKelime=scan.nextLine();

        if (metin.indexOf(aranacakKelime)==(-1)){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis ");
        }
        else if (metin.indexOf(aranacakKelime)==metin.lastIndexOf(aranacakKelime)) {
            System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");

        }else {System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");}
    }
}
