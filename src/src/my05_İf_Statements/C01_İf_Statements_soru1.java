package src.my05_İf_Statements;

import java.util.Scanner;

public class C01_İf_Statements_soru1 {
    public static void main(String[] args) {
        // kullanıcıdan bir sayi alın ve 5 ile bolunebiliyorsa "Sayi 5'in tam kati" yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();
        if (sayi%5==0){
            System.out.println("Sayi 5'in tam kati");
        }
    }
}
