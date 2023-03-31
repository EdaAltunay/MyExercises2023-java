package src.my06_İf_Else_Statements;

import java.util.Scanner;

public class C01_İfElseStatements_soru1 {
    public static void main(String[] args) {
        // kullanıcıdan bir ucgenin 3 kenar uzunlugunu alın,ucgen eskanar ucgen ise "Eskenar ucgen"
        // degilse "Eskenar ucgen degil" yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ucgenin kenar uzunluklarını giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();
        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar ucgen degil");
        }

    }

}
