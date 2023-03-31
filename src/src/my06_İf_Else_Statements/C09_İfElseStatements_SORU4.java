package src.my06_İf_Else_Statements;

import java.util.Scanner;

public class C09_İfElseStatements_SORU4 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan mesafeyi km olarak alın ve cevirmek istedigi birimi sorun.
        İstedigi birim metre veya cm ise cevirip yazdırın, yoksa "İstediginiz birim sisteme kayıtlı degil" yazdırın.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mesafeyi km olarak giriniz");
        double mesafe=scan.nextDouble();

        System.out.println("Lutfen cevirmek istediginiz birimi giriniz");
        String birim=scan.next();

        if (birim.equalsIgnoreCase("metre")|| birim.equalsIgnoreCase("m")) {
            System.out.println("girdiginizin degerin metre olarak hesabı: "+mesafe*1000);}
        else if (birim.equalsIgnoreCase("santimetre")|| birim.equalsIgnoreCase("cm")) {
            System.out.println("girdiginizin degerin santimetre olarak hesabı: "+mesafe*100000);}
        else {
            System.out.println("istediginiz birim sisteme kayıtlı degildir.");}



    }
    }
