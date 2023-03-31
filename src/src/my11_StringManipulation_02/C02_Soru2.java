package src.my11_StringManipulation_02;

public class C02_Soru2 {

    public static void main(String[] args) {
        /*  SORU2:  Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                    input1 : “15.30 €” ,
                    input2 : “11.40 €”
                    output : 26.70 €
         */
        String input1 = "15.30 €";
        String input2 = "11.40 €";
        double sayi1 = Double.parseDouble(input1.replaceAll("\\D", ""));
        double sayi2 = Double.parseDouble(input2.replaceAll("\\D", ""));

        double toplam =(sayi1+sayi2)/100;
        System.out.println(toplam +" €");
    }
}

