import java.util.Scanner;

public class Main {
    static boolean _isPalidrom(int Number)
    {
        int temp=Number,reverseNumber=0,lastNumber;
        while (temp!=0)
        {
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if(Number==reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Lutfen Bir Sayı Giriniz => ");
        int Number = input.nextInt();

        if(_isPalidrom(Number)==true)
        {
            System.out.println( );
            System.out.println(Number+" => Girdiniz Sayı Palindromik Sayıdır" );
        }
        else
        {
            System.out.println(Number+" => Girdiniz Sayı Palindromik Sayı Degildir" );
        }
    }
}
