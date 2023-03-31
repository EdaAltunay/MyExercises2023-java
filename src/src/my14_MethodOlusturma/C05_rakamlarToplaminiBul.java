package src.my14_MethodOlusturma;

public class C05_rakamlarToplaminiBul {
    public static void main(String[] args) {
        /*
         // verilen pozitif bir tamsayinin
        // rakamlar toplamini bize döndüren method olusturun
         */


        System.out.println(rakamlarToplamı(123));


    }

    public static int rakamlarToplamı(int sayi) {

        int toplam = 0;
        int basamakSayisi = ("" + sayi).length();

        for (int i = 0; i < basamakSayisi; i++) {
            int birlerBasamagı = sayi % 10;
            toplam += birlerBasamagı;
            sayi /= 10;
        }
        return toplam;

    }
}
