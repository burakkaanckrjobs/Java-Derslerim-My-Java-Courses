import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Bir Sayı Giriniz : ");
        int A=input.nextInt();

        for(int i = 1; i<=A; i*=2)
        {
            int j =0;
            System.out.println("2^"+j+" = "+i);
            j++;
        }


    }
}
