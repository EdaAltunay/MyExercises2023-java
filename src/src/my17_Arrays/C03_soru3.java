package src.my17_Arrays;

public class C03_soru3 {
    public static void main(String[] args) {
        /*     Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
                       basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
                       Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

         */

    int[]arr={1,2,3,4};
    arrElemanlariniSagaKaydir(arr);



    }
    public static int[] arrElemanlariniSagaKaydir(int[] arr){

        int temp=arr[arr.length-1];
        for (int i = 0; i <arr.length ; i++) {

            arr[arr.length-1-i]=arr[arr.length-2-i];
            arr[0]=temp;
        }
        return arr;



    }



}
