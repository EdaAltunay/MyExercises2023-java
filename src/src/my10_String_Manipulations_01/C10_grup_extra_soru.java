package src.my10_String_Manipulations_01;

public class C10_grup_extra_soru {
    public static void main(String[] args) {
      /*  SORU:
              name1 ve name2 degiskenlerini olusturun.
              name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
              name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik"
              yazdirin.
                e.g:
              name1= mehmet
              name2= ahmet
              Print ==> mehahmetmet
    */

 String name1="Mustafaa";
 String name2="Eda";
 int name1karakterSayısı=name1.length();
 String str1 =name1.substring(0,(name1karakterSayısı/2));
 String str2 =name1.substring(name1karakterSayısı/2);


 if (name1karakterSayısı%2==0){
     System.out.println(str1+name2+str2);
 }else {
     System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
 }
 }

    }

