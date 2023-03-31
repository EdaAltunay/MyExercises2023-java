package src.my17_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_soru5 {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize donduren bir method olusturun.

        ArrayOlusturma();
    }
    public static int[] ArrayOlusturma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen olusturacagimiz array'in boyutunu giriniz: ");
        int arayinBoyutu = scan.nextInt();
        int[] arr = new int[arayinBoyutu];
        for (int i = 0; i < arayinBoyutu; i++) {
            System.out.print("lutfen array in " + i + ". indexini giriniz: ");
            int eleman = scan.nextInt();
            arr[i] = eleman;
        }
        System.out.println(Arrays.toString(arr));
        return arr;


    }




    }




