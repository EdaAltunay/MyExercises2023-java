package src.my03_Scannerr;

import java.util.Scanner;

public class Scanner_soru4 {
    public static void main(String[] args) { Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dikdortgenin kisa kenarini giriniz");
        double kisakenar= scan.nextDouble();
        System.out.println("lutfen dikdortgenin uzun kenarini giriniz");
        double uzunkenar= scan.nextDouble();
        System.out.println("Dikdortgenin alani " + kisakenar*uzunkenar);

    }
}
