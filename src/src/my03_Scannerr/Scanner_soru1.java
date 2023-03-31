package src.my03_Scannerr;

import java.util.Scanner;

public class Scanner_soru1 {

    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("lutfen bir tamsayi giriniz");
    int sayi1= scan.nextInt();
    System.out.println("girilen tamsayi degeri=" + sayi1);

    System.out.println("lutfen bir ders ismi giriniz");
    String dersİsmi= scan.next();
    System.out.println("Girilen dersin ismi  " + dersİsmi);

    System.out.println("lutfen boyunuz giriniz");
    double boy= scan.nextDouble();
    System.out.println("boyunuz " +boy);





}

}


