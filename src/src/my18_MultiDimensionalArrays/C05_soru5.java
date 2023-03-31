package src.my18_MultiDimensionalArrays;

public class C05_soru5 {
    public static void main(String[] args) {
        /*    Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
                      toplaminini yazdiran bir method olusturun
         */

     int arr1[][] = {{2, 3, 10,}, {2, 5}, {4, 5},{1,2,6}};

    InnerArraylerinsonElementleriToplami(arr1);


    }


    public static void InnerArraylerinsonElementleriToplami(int[][] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {     /// 3 uzunluk
            for (int j = arr[i].length - 1; j <= arr[i].length - 1; j++) {
                toplam += arr[i][j];
            }
        }
        System.out.println("Array'in inner arraylerinin son elemenlerinin toplami: "+toplam);
    }


}


