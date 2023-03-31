package src.my19_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_soru3 {
    public static void main(String[] args) {
        /*   Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
                     kismini list olarak bize donduren bir method olusturun
         */

        String[] arr = {"defter", "kalem", "silgi", "kitap"};
        List<String> list = C07_ArraydanListOlusturmaMetod.arraydanList(arr);
        System.out.println(list);   // [defter, kalem, silgi, kitap]

        List<String> kalanlardanOlusanList=kalanlardanOlusanList(list,"r");
        System.out.println(kalanlardanOlusanList);


    }


    public static List<String> kalanlardanOlusanList(List<String> verilenList, String istenmeyenHarf) {
        List<String> yeniList = new ArrayList<>();

        for (int i = 0; i < verilenList.size(); i++) {

            if (!verilenList.get(i).contains(istenmeyenHarf)) {

                yeniList.add(verilenList.get(i));
            }

        }

        System.out.println(yeniList);

        return yeniList;


    }


}
