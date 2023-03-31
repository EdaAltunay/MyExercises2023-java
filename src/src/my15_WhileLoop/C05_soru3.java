package src.my15_WhileLoop;

public class C05_soru3 {
    public static void main(String[] args) {
        /* Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
                   donduren bir method olusturun.
         */


        System.out.println(tersCevir("eda"));
        System.out.println(tersCevir("mustafa"));
    }

    public static String tersCevir(String metin) {
        String tersMetin = "";
        int indexSayisi = metin.length() - 1;
        int i = indexSayisi;
        while (i >= 0) {
            tersMetin += metin.charAt(i);
            i--;
        }
        return tersMetin;


    }


}
