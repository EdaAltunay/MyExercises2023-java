package src.my16_DoWhileLoop;

public class C01_soru1 {
    public static void main(String[] args) {
        /*
            Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

         */


        //                          Soruyu while ile cozersek:
        //     char karakter = 'k';
        //     while (karakter<='t'){
        //     System.out.print(karakter+" ");
        //     karakter++;
        // }
        char karakter = 'k';
        do {
            System.out.print(karakter+" ");
            karakter++;
        } while (karakter <= 't');

    }
}
