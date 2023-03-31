package src.my10_String_Manipulations_01;

public class C03_soruu {
    public static void main(String[] args) {
      /*  SORU:...   Verilen bir cumlede, istenen bir String icin
                     asagidaki cumlelerden uygun olani yazdirin
                     1- aradiginiz kelime cumlede 1 kere kullanilmis
                     2- aradiginiz kelime cumlede 1'den fazla kullanilmis
                     3- aradiginiz kelime cumlede hic kullanilmamis     */
        
        String cumle="insanlar elele tutussa,birlik olsa,hayat bayram olsa.";
        String kelime="olsa";
        
        if (cumle.indexOf(kelime)==(-1)){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis ");
        } else if (cumle.indexOf(kelime)==cumle.lastIndexOf(kelime)) {
            System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
            
        }else {System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");}
    }
}
