package src.my06_İf_Else_Statements;

import java.util.Scanner;

public class C07_İfElseStatements_SORU2 {
    public static void main(String[] args) {
        //kullanıcının kilo ve boyunu isteyip vucut kitle indeksini hesaplayınız.
        // (kilo*1000/(boy*boy))
        //vki>30.. obez
        //25<vki<30... kilolu
        //25<vki<20.. normal
        // vki<20... zayıf     Yazdırın.
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen boyunuzu cm olarak giriniz");
        System.out.println("lutfen kilonuzu giriniz");
        double boy=scan.nextDouble();
        double kilo=scan.nextDouble();
        System.out.println("boyunuz: "+boy+"\nkilonuz: "+kilo);
        double vki=(kilo*10000/(boy*boy));
        System.out.println("vucut kitle indeksi :"+vki);
        if (vki>30) System.out.println("obez");
        else if (25<vki && vki<30) System.out.println("kilolu"); // SÜSLÜ PARANTEZ DE KOYABİLİRİZ. ANCAK SONUCLARIM
        else if (20<vki && vki<25) System.out.println("normal"); // BİR SIRA DAN FAZLA OLMADIĞI İCİN BU KODDA TERCİH ETMEDİM
        else  if (vki<20) System.out.println("zayıf");





    }}


