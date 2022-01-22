import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int Number=input.nextInt();
        int enb=0,enk=0;
            for(int i = 1; i<=Number;i++)
            {
                System.out.print(i+". Sayıyı giriniz: ");
                int Sayı=input.nextInt();
                if(enb<Sayı)
                {
                    enb=Sayı;
                }
                if(enk>Sayı)
                {
                    enk=Sayı;
                }
            }
        System.out.println("En büyük Sayı : "+enb);
        System.out.println("En Kücük Sayı : "+enk);
    }
}
