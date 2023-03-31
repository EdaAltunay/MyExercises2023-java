package src.my05_İf_Statements;

import java.util.Scanner;

public class C02_İf_Statements_soru2 {
    public static void main(String[] args) {
        // kullanıcıdan biir harf alın,harf ile baslayan bir ay varsa yazdırın.
        //not=buyuk harf kucuk harf hassasiyeti olmasın. kullanıcı o veya O yazdıgında ocak olsun.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        if (harf=='o' || harf=='O'){
            System.out.println("OCAK");
        }
        if (harf=='ş' || harf=='Ş'){
            System.out.println("ŞUBAT");
        }
        if (harf=='m' || harf=='M'){
            System.out.println("MART,MAYIS");
        }
        if (harf=='n' || harf=='N'){
            System.out.println("NİSAN");
        }
        if (harf=='h' || harf=='H'){
            System.out.println("HAZİRAN");
        }
        if (harf=='t' || harf=='T'){
            System.out.println("TEMMUZ");
        }
        if (harf=='a' || harf=='A'){
            System.out.println("AGUSTOS,ARALIK");}
        if (harf=='e' || harf=='E'){
            System.out.println("EYLUL,EKİM");
        }
        if (harf=='k' || harf=='K'){
            System.out.println("KASIM");
        }
    }
}
