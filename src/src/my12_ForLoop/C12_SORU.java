package src.my12_ForLoop;

public class C12_SORU {
    public static void main(String[] args) {
        /*
        SORU: 1-25 arasındakı cift sayıların 2 katını, tek sayıların 3 katını yazdıran programı yazınız.
         */


        for (int i = 2; i <25 ; i++) {
            if (i%2==0){
                System.out.print(i*2+" ");
            } else {
                System.out.print(i*3+" ");

            }

        }
    }
}
