package src.my09_Switch_Statements;

import java.util.Scanner;

public class C01_Soru1 {
    public static void main(String[] args) {
    /* switch statements daha duzenlı daha kullanıslıdır.
       else 3 den fazla ise switch_case kullanabiliriz.
       parantezin icinde ne gorurse case lerde onu arar.
       switch() parantezin icinde ;boolean, long , double , float kullanılamaz.
       switch() parantesin icinde ; string, integer , char kullanılabilir.
       parantezin icine yazılan deger hicbir case ile uyusmazsa default satırı devreye girer.(else gibi.)
     */
        // soru1: kullanıcıdan bir rakam alıp, rakamı yazıyla yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz.");
        int rakam =scan.nextInt();

        switch (rakam) {
            case 0 :
                System.out.println("Sifir");
                break;
            case 1 :
                System.out.println("Bir.");
                break;
            case 2 :
                System.out.println("İki");
                break;
            case 3 :
                System.out.println("Uc");
                break;
            case 4 :
                System.out.println("Dort");
                break;
            case 5 :
                System.out.println("Bes");
                break;
            case 6 :
                System.out.println("Alti");
                break;
            case 7 :
                System.out.println("Yedi");
                break;
            case 8 :
                System.out.println("Sekiz");
                break;
            case 9 :
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Rakam yanlıs girildi");




        }




    }
}
