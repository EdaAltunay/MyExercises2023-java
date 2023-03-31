package src.my05_İf_Statements;

import java.util.Scanner;

public class C03_İf_Statements_soru3 {
    public static void main(String[] args) {
        // kullanocıdan bir sayı alın, uc ıle bolunebiliyorsa "Uc ile bolunebilen sayi";
        // 5 ile bolunebiliyorsa "Bes ile bolunebilen sayi" yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsi giriniz.");
        int sayi= scan.nextInt();
        if (sayi%3==0){
            System.out.println("\"Uc ile bolunebilen sayi");
        }
        if (sayi%5==0){
            System.out.println("\"Bes ile bolunebilen sayi");
        }
    }
}
