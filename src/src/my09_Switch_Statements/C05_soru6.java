package src.my09_Switch_Statements;

import java.util.Scanner;

public class C05_soru6 {
    public static void main(String[] args) {
        // kullanıcıdan ay numarasını alıp mevsimi yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ay numarasını giriniz.");
        int ayNumarası =scan.nextInt();

        switch (ayNumarası){
            case 12:
            case 1:
            case 2:
                System.out.println("kıs");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("yanlıs giris yapttınız.");


        }
    }
}
