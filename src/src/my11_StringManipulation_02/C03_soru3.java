package src.my11_StringManipulation_02;

public class C03_soru3 {
    public static void main(String[] args) {

    /*: SORU3: Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
               sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.

               input : java1 ogRe2@nMek3 #ne +Gu=zel
               output : Java ogrenmek ne guzel.*/


        String input=" java1 ogRe2@nMek3 #ne +Gu=zel";
        input=input.replaceAll("\\d","").replaceAll(" ","5").replaceAll("\\W","");
        input=input.replaceAll("5"," ");
        input=input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase();  /// ilk harfi buyuk yapmak icin.

        System.out.println(input);

      }
}
