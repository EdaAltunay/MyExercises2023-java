package src.my10_String_Manipulations_01;

import java.util.Scanner;

public class C01_vaaaav_soru {
    public static void main(String[] args) {
         /* SORU:...Verilen bir cumlede, istenen bir String icin
                   asagidaki cumlelerden uygun olani yazdirin
                   1- aradiginiz kelime cumlede 1 kere kullanilmis
                   2- aradiginiz kelime cumlede 2 kere kullanilmis
                   3- aradiginiz kelime cumlede 2'den fazla kullanilmis
                   4- aradiginiz kelime cumlede hic kullanilmamis   */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz." +
                "\nArdından enter e basıp;metnin icinde aranılacak kelimeyi giriniz  ");
        String metin=scan.nextLine();
        String aranacakKelime=scan.nextLine();

        if (metin.indexOf(aranacakKelime)==(-1)){  // aranılan kelime hic kullanılmamıs.
            System.out.println("Metin aranılacak kelimeyi icermiyor");}
        else {                                   // o halde aranılan kelime kullanılmıs yani.
            int kelimeilkindex = metin.indexOf(aranacakKelime);
            if (metin.indexOf(aranacakKelime, (kelimeilkindex + 1)) == (-1)) {      /// aranılan kelime bir kere kullanılmıs
                System.out.println("Aranan kelime metinde 1 kere kullanılmıs");}
            else {                                                          // aranılan kelime 1 den fazla kullanılmıs.
                int ikinciKelimeIndex=metin.indexOf(aranacakKelime,(kelimeilkindex+1));
                if (metin.indexOf(aranacakKelime,(ikinciKelimeIndex+1))==(-1)) {// aranılan kelime 2 kere kullanılmıs
                    System.out.println("Aranılan kelime 2 kere kullanılmıs");}
                else System.out.println("2 den fazla kullanılmıs");
            }


        }

    }}
