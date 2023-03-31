package src.my14_MethodOlusturma;

import java.util.Scanner;

public class C02_soru2 {
    public static void main(String[] args) {
        /*

        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin.
                Isim ve soyismi ilk harfleri buyuk
                diger harfler kucuk olacak sekilde duzenleyip,
                isim bosluk soyisim seklinde bize donduren bir method olusturun
                input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

         */


        System.out.println(isimSoyisim());


    }
    public static String isimSoyisim(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        String isim= scan.nextLine();
        System.out.print("Lutfen soyisiminizi giriniz: ");
        String soyisim= scan.nextLine();
        String name=isim.substring(0,1).toUpperCase()+isim.substring(1,isim.length()).toLowerCase();
        String surname=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1,soyisim.length()).toLowerCase();
        String input=name+" "+surname;
        return input;
    }








}
