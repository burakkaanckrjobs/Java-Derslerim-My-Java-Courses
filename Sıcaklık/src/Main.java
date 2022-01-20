import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double Sıcaklık;
        System.out.print("Lutfen Hava Sıcaklıgını Giriniz : ");
        Sıcaklık=input.nextDouble();

        if(Sıcaklık<5)
        {
            System.out.println("Bugun Hava "+ Sıcaklık +" "+"Derecede  Düşük o yuzden  Size Önerim Kayak Yapmanız");

        }
        else if(Sıcaklık>=5 && Sıcaklık<15)
        {
            System.out.println("Bugun Hava "+ Sıcaklık +" "+ "Dercede  Size Önerim Sinemaya Gitmeniz ");
        }
        else if(Sıcaklık>=15 && Sıcaklık<25)
        {
            System.out.println("Bugun Hava "+ Sıcaklık +" "+ "Dercede  Size Önerim Piknik Gitmeniz ");
        }
        else
        {
            System.out.println("Bugun Hava "+ Sıcaklık +" "+ "Dercede  Size Önerim Yüzmeye  Gitmeniz ");
        }



    }
}
