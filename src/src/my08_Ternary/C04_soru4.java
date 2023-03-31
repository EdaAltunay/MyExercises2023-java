package src.my08_Ternary;

import java.util.Scanner;

public class C04_soru4 {
    public static void main(String[] args) {
        // soru4: kullanııcdan notunu alın 50 veya daha buyukse "sınıgı gectin",
        //        50 den kucukse "maalesef kaldın" yazdırın.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not=scan.nextDouble();

        System.out.println(not>=50 ? "Sınıfı gectin" : "maalesef kaldın");



        }
}
