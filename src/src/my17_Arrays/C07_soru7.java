package src.my17_Arrays;

import java.util.Arrays;

public class C07_soru7 {
    public static void main(String[] args) {
        /*   Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
                     eski array’e yeni degeri atayin.
         */
   int[] arr={1,2,3,4,5};

        System.out.println(Arrays.toString(ArrayeElemanEkleme(arr, 6)));


    }

    public static int[] ArrayeElemanEkleme(int[] ilkArr, int EklenecekEleman) {

        int[] yeniArr=new int[ilkArr.length+1];

        for (int i = 0; i <=ilkArr.length-1 ; i++) {

            yeniArr[i]=ilkArr[i];
        }
        yeniArr[ilkArr.length]=EklenecekEleman;


        return yeniArr;


    }


}
