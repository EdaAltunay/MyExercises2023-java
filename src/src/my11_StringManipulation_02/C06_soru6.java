package src.my11_StringManipulation_02;

import java.util.Scanner;

public class C06_soru6 {
    public static void main(String[] args) {
        /*
        Soru 6 : Kullanicidan alinan bir String alin,
                 String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
                 String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz: ");
        String kelime = scan.nextLine();
        int uzunluk = kelime.length();
        int sonHarfİndex = (kelime.length() - 1);

        String str1 = kelime.substring(0, uzunluk / 2) + " :) " + kelime.substring(uzunluk / 2 , kelime.length()); //uzunluk cift ise yazdirilacak kelime

        int ortadakiHarfİndex = (kelime.length() -1) / 2;   // uzunluk tek sayi ise ortadaki index;

        String str2 = kelime.substring(0,ortadakiHarfİndex) + " :( " + kelime.substring(ortadakiHarfİndex+1, kelime.length());
        // uzunluk tek ise yazdırılacak kelime


        if (uzunluk%2==0){   // uzunluk cift ise
            System.out.println(str1);
        }else {  // uzunluk tek ise;
            System.out.println(str2);
        }


    }
}
