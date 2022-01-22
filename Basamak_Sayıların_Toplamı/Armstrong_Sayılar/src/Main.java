import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sorgulamak İstediğiniz Sayı Giriniz :");
        int Number=input.nextInt();
        int BasNumber=0;
        int BasValue;
        int TempNumber=Number;
        int result=0;
        int BasPow=1;
        while (TempNumber!=0)
        {
            TempNumber/=10;
            BasNumber++;
        }
        TempNumber=Number;
        while (TempNumber!=0)
        {
            BasValue=TempNumber%10;
            BasPow=1;
            for(int i = 1; i<=BasNumber;i++)
            {
                BasPow*=BasValue;
            }
            result+=BasPow;
            TempNumber/=10;
        }

        if(result==Number)
        {
            System.out.println(Number+ " sayısı  bir armstrong sayıdır");
        }
        else
        {
            System.out.println(Number+ " sayısı  bir armstrong sayı Degildir");
        }
    }
}
