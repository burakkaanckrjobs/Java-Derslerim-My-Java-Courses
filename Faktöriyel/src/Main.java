import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int Faktoriyel,Sonuc=1;
        System.out.println("Lutfen Bir sayı Giriniz : ");
        Faktoriyel=input.nextInt();

        for(int i =Faktoriyel; i>0;i--)
        {
            Sonuc*=i;
            System.out.print(i+" ");
        }
        System.out.print("= ");
        System.out.print(Sonuc);
    }
}
