package src.my19_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C07_ArraydanListOlusturmaMetod {
    public static void main(String[] args) {
        // verilen bir array'dan list olusturma methodu yapalım:


        int[]arr={1,2,5,6,8,8,};
        arraydanList(arr);

        String[]arr1={"eda","mustafa","ömer salih","sems"};
        arraydanList(arr1);




    }
  public static List<Integer> arraydanList(int[] verilenArr) {

      List<Integer> olusanList=new ArrayList<>();
      for (int i = 0; i <verilenArr.length ; i++) {
          olusanList.add(verilenArr[i]);

      }
      System.out.println(olusanList);
      return olusanList;


  }


    public static List<String> arraydanList(String [] verilenArr) {

        List<String> olusanList=new ArrayList<>();

        for (int i = 0; i <verilenArr.length ; i++) {
            olusanList.add(verilenArr[i]);

        }
        System.out.println(olusanList);
        return olusanList;


    }





}
