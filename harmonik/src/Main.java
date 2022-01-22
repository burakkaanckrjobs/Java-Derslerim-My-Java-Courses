import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısını Giriniz :");
        int N=input.nextInt();
        double reuslt=0;
        for (int i =1 ; i<=N;i++)
        {
           reuslt+=(1.0/N);
        }
        System.out.println(reuslt);
    }
}
