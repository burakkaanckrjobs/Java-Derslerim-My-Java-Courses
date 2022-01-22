import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int Number =input.nextInt();
        int i=Number,reuslt=0;

        while (i>=1)
        {
            if(Number%i==0)
            {
                reuslt+=i;
            }
            i--;
        }
        if(reuslt==(Number*2))
        {
            System.out.println(Number+" Mükemmel sayıdır..");
        }
        else
        {
            System.out.println(Number+ " Mükemmel sayı değildir..");
        }
    }

}
