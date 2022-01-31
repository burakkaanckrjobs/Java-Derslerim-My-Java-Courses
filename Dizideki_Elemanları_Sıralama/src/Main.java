import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in =new Scanner(System.in);
        System.out.print("Dizinin Boyuttunu giriniz : ");
        int Number=in.nextInt();
        int input;

        int[]Sub=new int[Number];
        for (int i =0;i< Sub.length;i++)
        {
            System.out.print((i+1)+" Elemanı Giriniz : ");
            input=in.nextInt();
            Sub[i]=input;
        }
        Arrays.sort(Sub);
        System.out.print("Sıralama : ");
        System.out.print("[");
        for (int i :Sub)
        {
            System.out.print(i+" ");
        }
        System.out.print("]");

    }
}
