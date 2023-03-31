package src.my03_Scannerr;

import java.util.Scanner;

public class Scanner_soru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cemberin yaricapini giriniz");
        double yaricap= scan.nextDouble();

        System.out.println("cemberin cevresi :"+ 2*3*yaricap);
        System.out.println("cemberin alani :"+ 3*yaricap*yaricap);

    }
}
