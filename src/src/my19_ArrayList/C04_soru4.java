package src.my19_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_soru4 {
    public static void main(String[] args) {
        /*     Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
                       sayisini bir list olarak donduren bir method olusturun.

                       0 1 1 2 3 5 8 13 21 34 55 89 ....*/
        System.out.println(fibonacciList(10));


    }

    public static List<Integer> fibonacciList(int sayi) {
        List<Integer> fibonacciList = new ArrayList<>();
        if (sayi == 0) {
            System.out.println("Girilen sayi yanlıs");
        } else if (sayi == 1) {
            fibonacciList.add(0);
            fibonacciList.add(1);
        } else {                                  // sayi=5 olsun
            int ilkTerim = 0;
            fibonacciList.add(ilkTerim);
            int ikinciTerim = 1;
            fibonacciList.add(ikinciTerim);
            int yeniTerim = ilkTerim + ikinciTerim;
            fibonacciList.add(yeniTerim);         //  [0, 1, 1]
            while (fibonacciList.size() < sayi) {
                ilkTerim = ikinciTerim;
                ikinciTerim=yeniTerim;
                yeniTerim = ilkTerim + ikinciTerim;
                fibonacciList.add(yeniTerim);
            }
        }
        return fibonacciList;
    }
}















