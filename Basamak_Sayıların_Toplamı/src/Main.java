import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayı Giriniz : ");
        int Number = input.nextInt();
        int reuslt = 0, TempReuslt,basValue,TempNumber;
        TempNumber=Number;
        while (TempNumber != 0)
        {

            TempReuslt=TempNumber%10;
            TempNumber/=10;
            reuslt+=TempReuslt;
        }
        System.out.println(Number+" Sayısının Basamakların Toplamı : "+reuslt);

    }
}
