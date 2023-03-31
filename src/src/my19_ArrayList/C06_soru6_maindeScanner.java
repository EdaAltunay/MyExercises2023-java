package src.my19_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_soru6_maindeScanner {
    public static void main(String[] args) {
          /*    Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
                      tamsayilari bir liste olarak bize donduren bir method olusturun
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bölenlerini ögrenmek istediginiz pozitif bir tamsayi giriniz: ");
        int girilenSayi = scan.nextInt();
        PozitifBölenlerListi(55);
    }

    public static List<Integer> PozitifBölenlerListi(int sayi) {
        List<Integer> pozitifBölenlerListi = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                pozitifBölenlerListi.add(i);
            }
        }
        System.out.println(pozitifBölenlerListi);
        return pozitifBölenlerListi;


    }


}
