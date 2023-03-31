package src.my11_StringManipulation_02;

import java.util.Scanner;

public class C01_Soru1 {
    public static void main(String[] args) {
        /*
        SORU1: kullanıcıdan bir cumle alın.
               cumlede ev geciyorsa ,"home home sweet home" yazdırın.
               cumlede is geciyorsa "calısmak güzeldir" yazdırın.
               ikisini de iceriyorsa "Hem ev lazim hem is" yazdırın.
               hicbirini icermiyorsa "cok calısman lazım." yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        if (cumle.contains("ev") && !cumle.contains("is")) {
            System.out.println("home home sweet home");
        }
        if (cumle.contains("is") && !cumle.contains("ev")) {
            System.out.println("calısmak guzeldir");
        }
        if (cumle.contains("ev") && cumle.contains("is")) {
            System.out.println("Hem ev lazim hem is");
        }
        if (!cumle.contains("ev") && !cumle.contains("is")) {
            System.out.println("cok calısman lazım.");
        }


    }
}
