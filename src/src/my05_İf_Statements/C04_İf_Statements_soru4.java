package src.my05_İf_Statements;

import java.util.Scanner;

public class C04_İf_Statements_soru4 {
    public static void main(String[] args) {
        // kullanıcıdan bie eskenar ucgenin uc kenarını alın ve eger ESKENAR ucgen ise "Eskenar ucgen" yazdırınç
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir ucgenin uc kenarını giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();
        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");

    }
}}
