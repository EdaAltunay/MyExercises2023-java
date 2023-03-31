package src.my19_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru1 {
    public static void main(String[] args) {


    // list soru 2
    // System.out.println(kullanicanIsimAlveDondur());

    int []arr = {2,3,1,4,2,4,4,5,1,6,7,89,0};
    System.out.println(Arrays.toString(tekrarliOlanlariSil(arr)));}


    public static int[] tekrarliOlanlariSil(int[]arr){
        /*
    Verilen bir array’de tekrar eden elementler icin,
    mukerrer olanlari silip, tum elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
     */

        List<Integer> yeniListe=new ArrayList<>();

        //int []arr = {2,3,1,4,2,4,4,5};



        for (int i = 0; i < arr.length; i++) {
            if (!yeniListe.contains(arr[i])){
                yeniListe.add(arr[i]); // 2,3,1,4,5 liste
            }
        }
        int [] arr1= new int[yeniListe.size()];

        for (int i = 0; i <yeniListe.size() ; i++) {
            arr1[i]=yeniListe.get(i);
        }
        return arr1;
    }
}
