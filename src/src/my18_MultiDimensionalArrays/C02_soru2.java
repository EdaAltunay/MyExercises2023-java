package src.my18_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_soru2 {
    public static void main(String[] args) {
        /*
          Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
                  olusturacagimiz tek katli bir array’e bu toplamlari atayin.
                  input : int[][]  arr = {{3,4,5}, {2,3,6,7}};
                  output: [5, 7, 11]
         */

        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7},{1,2}};    // verilen array
        int innerArraylerinEnKisasınınUzunlugu = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length <= innerArraylerinEnKisasınınUzunlugu) {
                innerArraylerinEnKisasınınUzunlugu = arr[i].length;
            }
        }
        // System.out.println(innerArraylerinEnKisasınınUzunlugu);       3

        int[] toplamlarArrayi = new int[innerArraylerinEnKisasınınUzunlugu];     // [0,0,0]
        int ayniİndexlerToplami = 0;


        for (int i = 0; i < toplamlarArrayi.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                ayniİndexlerToplami += arr[j][i];
            }
            toplamlarArrayi[i] = ayniİndexlerToplami;
            ayniİndexlerToplami = 0;
        }
        System.out.println(Arrays.toString(toplamlarArrayi));


    }
}
