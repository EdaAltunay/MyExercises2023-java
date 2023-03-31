package src.my07_Nested_İf_Else_Statements;

import java.util.Scanner;

public class C05_soru4 {
    public static void main(String[] args) {
        /* kullanıcıdan gün ismini girmesini isteyiniz.
           girilen gün hafta ici ise "simdi calısma zamanı tatile... gun var yazdırın."
           girilen gün hafta sonu ise "Simdi dinlenme zamanı " yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gün ismini giriniz.");
        String gun=scan.next();

        if (gun.equalsIgnoreCase("pazartesi")|| gun.equalsIgnoreCase("salı") ||
            gun.equalsIgnoreCase("carsamba") || gun.equalsIgnoreCase("persembe") ||
        gun.equalsIgnoreCase("cuma")){
            System.out.println("Simdi calısma zamanı.tatile" +(gun)+"gun var.");
        }




    }
}
