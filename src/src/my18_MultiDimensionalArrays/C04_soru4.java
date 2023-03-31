package src.my18_MultiDimensionalArrays;

public class C04_soru4 {
    public static void main(String[] args) {
        /*   Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpimini bize donduren bir method olusturun.
         */


        int[][] arr = {{3, 2, 2}, {2, 2, 1, 1}};    // verilen array


        int carpim=1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpim*=arr[i][j];

            }

        }
        System.out.println("Verilen array'in tüm elemantlarinin carpimi: "+carpim);






    }
}
