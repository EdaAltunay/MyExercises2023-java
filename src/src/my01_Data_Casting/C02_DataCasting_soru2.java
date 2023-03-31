package src.my01_Data_Casting;

import java.util.Scanner;

public class C02_DataCasting_soru2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz.");
        char girilenharf=scan.next().charAt(0);
        System.out.println("girilen harften sonraki uc harf: "
                +"\n"+ (char)(girilenharf+1)+","
                +"\n"+ (char)(girilenharf+2)+","
                +"\n"+ (char)(girilenharf+3));
    }
}
