package src.my17_Arrays;

public class C04_soru4 {
    public static void main(String[] args) {
        /*    Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
                      kullanildigini yazdiran bir method olusturun.
       */

    int [] arr={1,2,3,3,3,4,5,};
    String [] arr1={"v","a","r","m","i","m"};

    ElemanSayisiYazdir(arr1,"m");
    ElemanSayisiYazdir(arr,3);





    }

    public static void ElemanSayisiYazdir(int[] arr, int arananEleman) {


        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananEleman) {
                sayac++;
            }
        }
        System.out.println("Verilen array de aranan " + arananEleman + " elementi " + sayac + " defa kullanilmistir.");


    }

    public static void ElemanSayisiYazdir(String[] arr, String arananElement) {


        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananElement) {
                sayac++;
            }
        }
        System.out.println("Verilen array de aranan " + arananElement+ " elementi " + sayac + " defa kullanilmisdir.");


    }

}