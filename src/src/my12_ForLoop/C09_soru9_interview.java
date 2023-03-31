package src.my12_ForLoop;

import java.util.Scanner;

public class C09_soru9_interview {
    public static void main(String[] args) {
        // SORU9: kullanıcıdan bir strig isteyin ve strig i tersten yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz:");
        String kelime= scan.next();

        int basamaksayisi=kelime.length();
        String ters="";


        for (int i = basamaksayisi-1; i >=0 ; i--) {

            ters+=kelime.charAt(i);
        }


        System.out.println(ters);

    }
}
