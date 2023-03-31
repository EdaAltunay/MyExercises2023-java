package src.my18_MultiDimensionalArrays;

public class C01_soru1 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir method olusturun.
         */

        int arr1[][] = {{2, 3, 10,}, {2, 5}, {4, 8}};
        ciftSayilarToplami(arr1);


    }

    public static int ciftSayilarToplami(int[][] arr) {
        int ciftSayilarToplami = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {

                    ciftSayilarToplami += arr[i][j];

                }

            }

        }
        System.out.println(ciftSayilarToplami);
        return ciftSayilarToplami;

    }
}
