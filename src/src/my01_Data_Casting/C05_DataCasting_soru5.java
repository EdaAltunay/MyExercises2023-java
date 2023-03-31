package src.my01_Data_Casting;

import java.util.Scanner;

public class C05_DataCasting_soru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen ilk olarak ondalikli bir sayi girip daha sonra ENTER e basip,bir tamsayi giriniz");
        double db1= scan.nextDouble();
        int int1 = scan.nextInt();

        int sayi=(int)db1/int1;

        System.out.println("Ondalikli sayinin tamsayiya bolumu : "+ (int)(db1/int1));
        System.out.println("ondalikli sayinin tamsayiya bolumu :" +sayi);
    }
}
