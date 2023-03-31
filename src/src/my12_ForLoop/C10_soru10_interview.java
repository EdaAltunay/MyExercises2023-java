package src.my12_ForLoop;

import java.util.Scanner;

public class C10_soru10_interview {
    public static void main(String[] args) {
    /*
    SORU10:  kullanıcıdan bir string isteyin ve string i ters cevirip kaydedin.
     */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz:");
        String kelime=scan.next();
        String ters="";
        int harfSayisi=kelime.length();

        for (int i = harfSayisi-1; i >=0 ; i--) {
               ters+=kelime.charAt(i);                   //  ters=ters.concat(String.valueOf(kelime.charAt(i)));
        }
           System.out.println(ters);
















    }}
