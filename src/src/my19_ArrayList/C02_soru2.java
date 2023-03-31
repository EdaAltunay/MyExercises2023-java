package src.my19_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_soru2 {
    public static void main(String[] args) {
        /*   Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
                     liste olarak dondurecek bir method olusturun.
         */

   kullanıcıyaListOlusturtma();


    }

    public static List<String> kullanıcıyaListOlusturtma() {
        Scanner scan = new Scanner(System.in);
        List<String> yeniList = new ArrayList<>();
        String girilenİsim;

        do {
            System.out.println("Lutfen list'e eklenmek uzere isim giriniz." +
                    "\nBitirmek icin Q ya basınız.");
            girilenİsim = scan.nextLine();
            if (!girilenİsim.equalsIgnoreCase("q")) {

                yeniList.add(girilenİsim);
            }

        } while (!girilenİsim.equalsIgnoreCase("q"));

        System.out.println(yeniList);
        return yeniList;


    }
}
