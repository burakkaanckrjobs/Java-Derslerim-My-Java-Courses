import java.util.Scanner;

public class Daire_Alanı_Ve_Cevresi
{
    public static void main(String[] args)
    {
        double Pi=3.14;
        int Cap;
        double Alan,Cevre;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yarı Capını Giriniz : ");
        Cap=input.nextInt();
        Alan=Pi*(Cap*Cap);
        Cevre=(Pi*2)*Cap;
        System.out.println("");
        System.out.println("Dairenin  Alanı : "+Alan);
        System.out.println("Dairenin  Cevre : "+Cevre);
    }
}
