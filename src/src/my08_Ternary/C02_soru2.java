package src.my08_Ternary;

import java.util.Scanner;

public class C02_soru2 {
    public static void main(String[] args) {
        // soru2: kullanıcıdan bir ucgenin 3 kenar uzunlugunu alın,eskanar ucgen olup olmadıgını yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarını giriniz.");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3= scan.nextDouble();

        System.out.println(kenar1==kenar2 && kenar1==kenar3 ? "Eskenar ucgen ": "Eskenar ucgen degildir.");

    }
}
