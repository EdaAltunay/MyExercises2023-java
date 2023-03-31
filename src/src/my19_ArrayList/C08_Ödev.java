package src.my19_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_Ödev {
    public static void main(String[] args) {
        /*
        odev : verilen bir listede, istenen 2 index'deki elementlerin yerini degistirip
               yeni listeyi bize donduren bir method olusturun
         */

        List<Integer> verilenList = new ArrayList<>();
        verilenList.add(1);
        verilenList.add(2);
        verilenList.add(3);
        verilenList.add(7);
        System.out.println(verilenList);
        arrayElemanYerleriniDegistir(verilenList, 3, 5);


    }

    public static List<Integer> arrayElemanYerleriniDegistir(List<Integer> verilenList, int i, int i1) {


        int sayi= verilenList.get(i);
        




        return verilenList;
    }


}
