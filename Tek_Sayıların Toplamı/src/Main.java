import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Bir Sayı Giriniz : ");
        int A =input.nextInt();
        int Toplam =0;

        for (int i = 0 ; i<=A;)
        {
            if(i%2!=0)
            {
                Toplam+=i;
                System.out.println(i);
                i++;
            }
            else
            {
                i++;
            }
        }
        System.out.println("0 - "+A+" ya Kadar Tek Sayıların Toplamı : "+Toplam);
    }
}
