package src.my10_String_Manipulations_01;

import java.util.Scanner;

public class C09_grup_extra_soru {
    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    /*  SORU:
             Kulanicidan bir kelime isteyin.
             eger kelime 3 ve daha fazla harfden olusuyorsa son iki harfini 3 kere yan yana yazdirin.
             degil ise girilen kelimeyi yazdirin
             ornek:
             input = Ali
             output = lilili
             input = el
             output = el */

        System.out.println("Lutfen bir kelime giriniz.");
        String kelime=scan.next();
        int harfsayısı=kelime.length();  // karakter sayısı
        if (harfsayısı>=3){
            System.out.print((kelime.substring(harfsayısı-2)).repeat(3));
        }else System.out.println(kelime);



    }


}
