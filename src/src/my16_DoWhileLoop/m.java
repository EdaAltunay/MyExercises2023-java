package src.my16_DoWhileLoop;

import java.util.Scanner;

public class m {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen tamkare olup olmadıgını merak ettiginiz pozitif bir tamsayi giriniz: ");
        int sayi = scan.nextInt();
        int i = 2;

        while (i < sayi) {

            if (i*i==sayi) {
                System.out.println("tamkaredir.");

            } else if(i*i!=sayi){
                System.out.println("tamkare degildir.");
                i++;
            }
        }


    }
}
