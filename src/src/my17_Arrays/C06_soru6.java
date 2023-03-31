package src.my17_Arrays;

public class C06_soru6 {
    public static void main(String[] args) {
        /*

        Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
         */
        String[] arr = {"Eda", "Mustafa", "Ömer", "Salih",};
        EnUzunEnKisaKelime(arr);


    }

    public static void EnUzunEnKisaKelime(String[] arr) {
        String EnUzunKelime = arr[0];
        String EnKisaKelime = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() <= EnKisaKelime.length()) {
                EnKisaKelime = arr[i];

            }
            if (arr[i].length() >= EnUzunKelime.length()) {
                EnUzunKelime = arr[i];

            }
        }
        System.out.println("En uzun kelime: " + EnUzunKelime);
        System.out.println("En kisa kelime: " + EnKisaKelime);


    }
}
