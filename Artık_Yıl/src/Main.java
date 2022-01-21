import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int Yıl,Mod_1,Mod_2;
        System.out.print("Yıl Giriniz : ");
        Yıl=input.nextInt();
        Mod_1=Yıl%4;
        Mod_2=Yıl%400;

        if(Mod_1==0)
        {
            System.out.println(Yıl+" Bir Artık Yıldır !");
        }
        else if(Mod_2==0 && Yıl/100==0)
        {
            System.out.println(Yıl+" Bir Artık Yıldır !");
        }
        else
        {
            System.out.println(Yıl+" Bir Artık Yıl Değildir !");
        }
    }
}
