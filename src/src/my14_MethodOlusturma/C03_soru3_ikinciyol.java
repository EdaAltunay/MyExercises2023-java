package src.my14_MethodOlusturma;

import java.util.Scanner;

public class C03_soru3_ikinciyol {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("SAyı gir");
    int sayi = scan.nextInt();
    mesajVer(asalKontrol(sayi));
}

    public static Boolean asalKontrol(int sayi) {
        if(sayi == 1) {
            System.out.println("1 Asal sayı kabul edilemez.");
            System.exit(0);}

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void mesajVer(boolean sonuc) {
        if(sonuc) System.out.println("Asal");
        else System.out.println("Asal Değil");
    }

}
