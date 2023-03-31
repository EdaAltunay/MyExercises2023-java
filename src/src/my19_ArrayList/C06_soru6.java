package src.my19_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_soru6 {
    public static void main(String[] args) {
        /*    Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
                      tamsayilari bir liste olarak bize donduren bir method olusturun
         */

   PozitifBölenlerList(15);



    }
    public static List<Integer> PozitifBölenlerList(int sayi){
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen tam bölenlerini ögrenmek istediginiz pozitif bir tamsayi giriniz: ");
        sayi= scan.nextInt();


        List<Integer> pozitifBölenler=new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                pozitifBölenler.add(i);
            }

        }
        System.out.println(pozitifBölenler);
        return pozitifBölenler;

    }

}
