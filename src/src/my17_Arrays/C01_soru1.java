package src.my17_Arrays;

import java.util.Arrays;

public class C01_soru1 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
                olusturun. Eski array’i yeni haliyle kaydedin.

         */

        int[]arr1 = {1, 2, 3,};
        arr1=arrayElementleriniartir(arr1,1);
        System.out.println(Arrays.toString(arr1));


    }

    public static int[] arrayElementleriniartir(int[] arr, int artisMiktari) {


        for (int i = 0; i < arr.length; i++) {
            arr[i] += artisMiktari;
        }
        return arr;
    }






}
