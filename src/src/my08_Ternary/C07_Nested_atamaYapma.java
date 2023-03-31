package src.my08_Ternary;

public class C07_Nested_atamaYapma {
    public static void main(String[] args) {


        int a=10;
        int x=10;
        int y=15;

        int z= a>0 ? y++ : --x ; // z=y oldu yani: z=15 , sonra y yi arttırıyoruz y=16

        System.out.println(x +" ," +y+" ,"+z); // 10,16,15
    }
}
