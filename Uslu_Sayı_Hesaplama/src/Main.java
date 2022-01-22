import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int Ust,Sonuc=1,Sayi;

        System.out.print("Lutfen Bir Sayı Giriniz : ");
        Sayi=input.nextInt();
        System.out.print("İstenen Kuveti Giriniz : ");
        Ust=input.nextInt();


        for(int i =1;i<=Ust;)
        {
            Sonuc=Sonuc*Sayi;
            i++;
        }
        System.out.println(Sayi+"^"+Ust+" ="+Sonuc);
    }
}
