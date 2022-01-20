import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double Mat,Kimya,Fizik,Turkce,muzik;
        System.out.println("Mat Notunuzu Giriniz : ");
        Mat=input.nextDouble();
        System.out.println("Kimya Notunuzu Giriniz :");
        Kimya=input.nextDouble();
        System.out.println("Fizik Notunuzu Giriniz : ");
        Fizik=input.nextDouble();
        System.out.println("Turkce Notunuzu Giriniz : ");
        Turkce= input.nextDouble();
        System.out.println("Muzik Notunuzu Giriniz : ");
        muzik=input.nextDouble();

        double avarge=(Mat+Fizik+Turkce+muzik+Kimya)/5;

        if(avarge<=55)
        {
            System.out.println("Sınıfta Kaldınız... ");
            System.out.println("Ortalama : "+avarge);
        }
        else
        {
            System.out.println("Sınıfı Geçtiniz... ");
            System.out.println("Ortalama : "+avarge);
        }
    }
}
