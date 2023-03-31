package src.my09_Switch_Statements;

import java.util.Scanner;

public class C04_soru5 {
    public static void main(String[] args) {
        // kullanıcıdan gun numarasını alıp hafta ici veya hafta sonu yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun numarasını giriniz.");
        int gunNumarası=scan.nextInt();
        switch (gunNumarası){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafta ici bir gun.");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu bir gun");
                break;
            default:
                System.out.println("yanlıs giris yaptınız.");


        }

    }
}
