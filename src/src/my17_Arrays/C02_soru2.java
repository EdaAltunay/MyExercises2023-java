package src.my17_Arrays;

public class C02_soru2 {
    public static void main(String[] args) {
        /*   Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.

         */

        int[] arr = {1, 2, 3,4,5,6,};
        int toplam=arrElemanlariTopla(arr);
        System.out.println(toplam);
    }

    public static int arrElemanlariTopla(int[] arr) {

        int arrElemenlaritoplami = 0;

        for (int i = 0; i < arr.length; i++) {
            arrElemenlaritoplami += arr[i];

        }
        return arrElemenlaritoplami;
    }
}
