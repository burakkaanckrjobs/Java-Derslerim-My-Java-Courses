import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double A; double B;
        int islem =0;
        System.out.print("Birinci Sayı Giriniz : ");
        A=input.nextDouble();
        System.out.print("Birinci Sayı Giriniz : ");
        B=input.nextDouble();
        System.out.println("İşlemler"+"Toplama : 1 "+"\n"
                                     +"Çıkarma : 2"+"\n"
                                     +"Bölme : 3"+"\n"
                                     +"Carpma : 4"+"\n"
                                     +"1-4 Arası Bir İşlem Şeçiniz");
        islem=input.nextInt();
        switch (islem)
        {
            case 1:
                System.out.println( A+"+"+ B +"="+(A+B));
                break;
            case 2:
                System.out.println( A+"-"+ B +"="+(A-B));
                break;
            case 3:
                System.out.println( A+"/"+ B +"="+(A/B));
                break;
            case 4:
                System.out.println( A+"*"+ B +"="+(A*B));
                break;
            default:
                System.out.println("Lütfen 1-4 Arasında Bir İşlem Giriniz ");
        }
    }
}
