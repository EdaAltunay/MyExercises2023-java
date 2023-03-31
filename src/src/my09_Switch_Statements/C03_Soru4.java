package src.my09_Switch_Statements;

import java.util.Scanner;

public class C03_Soru4 {
    public static void main(String[] args) {
        // kullanıcıdan ISTQB kısaltmasından harfin anlamını ogrenmek istediğini alın ve
        // girilen harfin karsılıgını yazdırın.
        // I: International
        // S: Software
        // T: Testing
        // Q: Qualifications
        // B: Board

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ISTQB kısaltmasından anlamını ögrenmek istediginiz harfi buyuk harf olarak" +
                " giriniz.");
        char harf=scan.next().charAt(0);


        switch (harf){
            case 'I':
                System.out.println("I: International");
                break;
            case 'S':
                System.out.println(" S: Software");
                break;
            case 'T':
                System.out.println("T: Testing");
                break;

            case 'Q':
                System.out.println(" Q: Qualifications");
                break;
            case 'B':
                System.out.println("B: Board");
                break;
            default:
                System.out.println("yanlıs harf girdiniz.");

        }

    }
}
