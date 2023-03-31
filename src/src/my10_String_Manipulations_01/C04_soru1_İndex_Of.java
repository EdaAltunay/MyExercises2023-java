package src.my10_String_Manipulations_01;

import java.util.Scanner;

public class C04_soru1_İndex_Of {
    public static void main(String[] args) {
        /*
        Soru 1 : Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
                 icerip icermedigini indexOf( ) method’u kullanarak yazdirin.
                 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz." +
                "\nArdından enter e basıp;metnin icinde aramamızı istediginiz kelime ya dakarakteri giriniz  ");
        String metin=scan.nextLine();
        String aranacakKelime=scan.nextLine();

        if (metin.indexOf(aranacakKelime)==(-1)){
            System.out.println("Metin icerisinde aranan kelime bulunmamaktadır.");
        }else {System.out.println("Metin icerisinde aranan kelime bulunmaktadır.");}
    }
}
