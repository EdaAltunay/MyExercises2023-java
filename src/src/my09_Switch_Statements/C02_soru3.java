package src.my09_Switch_Statements;

import java.util.Scanner;

public class C02_soru3 {
    public static void main(String[] args) {
        // kullanıcıdan ay numarasını alıp ay ismini yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ay numarasını giriniz.");
        int aynumarası=scan.nextInt();

        switch (aynumarası){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("ay numarası yanlıs girildi.");
        }


    }
}
