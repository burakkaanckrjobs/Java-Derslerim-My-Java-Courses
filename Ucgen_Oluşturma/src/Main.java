import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayı Giriniz ");
        int Number=input.nextInt();
        int j;

        for(int i = 1; i<=Number;i++)
        {
            for(int k=1;k<=(Number-i);k++)
                {
                    System.out.print(" ");
                }
            for (j = 1; j<=(2*i-1);)
                {
                System.out.print("*");
                j++;
                }
            System.out.println(" ");
        }
    }
}
