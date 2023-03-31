package src.my04_Concetenation;

public class C01_odev {;

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = " ";       /// BOŞLUK;
        String s3 = "kolay";
        String s4 = "";       /// HİÇLİK;

        int a= 3;
        int b=4;

        System.out.println("12 Java kolay :"+a*b+s2+s1+s2+s3);
        System.out.println("7 Java kolay  :"+(a+b)+s2+s1+s2+s3);
        System.out.println("34Java kolay  :"+a+s4+b+s1+s2+s3);
        System.out.println("Java12kolay   :"+s1+a*b+s3);
        System.out.println("Java34kolay   :"+s1+a+s4+b+s3);
        System.out.println("Java7kolay    :"+s1+(a+b)+s3);

    }
}
