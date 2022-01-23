import java.util.Scanner;

public class Main {

    static void  Menu()
    {

        System.out.println("Patika Hesap Makinesine Hoş Geldiniz \n");
        System.out.println("İslemler "+"\n"
                +"1- Toplama İşlemi "+"\n"
                +"2- Çıkarma İşlemi"+"\n"
                +"3-Carpma İşlemi"+"\n"
                +"4-Bölme İşlemi "+"\n"
                +"5-Üslü Sayı Hesaplama"+"\n"
                +"6-Faktoriyel Hesaplama"+"\n"
                +"7-Mod Alma"+"\n"
                +"8- Dikdörtgen Alan ve Çevre Hesabı"+"\n"
                +"0- Cıkış Yap");
    }
    static  void Toplama(int A,int B)
    {
        int reuslt=A+B;
        System.out.println("Toplama : "+A+" + "+B+" =>"+reuslt);

    }
    static  void Cıkarma(int A,int B)
    {
        int reuslt=A-B;
        System.out.println("Çıkarma : "+A+" - "+B+" =>"+reuslt);

    }
    static  void Carpma(int A,int B)
    {
        int reuslt=A*B;
        System.out.println("Carpma : "+A+" X "+B+" =>"+reuslt);
    }
    static  void Bolme(double A,double B)
    {
        double reuslt=A/B;
        System.out.println("Carpma : "+A+" /*"+B+" =>"+reuslt);

    }
    static  void Ust_Alma(int A,int Ust)
    {
        int result=1;
        for(int i=1;i<=Ust;i++)
        {
            result+=A*A;
        }
        System.out.println(A+"^"+Ust+" Hesabı : "+result);

    }
    static  void Faktoriyel(int A)
    {
        int result=1;
        for(int i =A;i>0;i--)
        {
            result*=i;
        }
        System.out.println(A+"Sayısının Faktoriyeli => "+result);

    }
    static  void Mod_Alma(int A,int B)
    {
        int result =0;
        System.out.println(A+"%"+B+" => "+result);

    }
    static void Dik_Alan_Cevre(int A,int B)
    {
        int result_Alan=0;
        int result_Cevre=0;

        result_Alan=A*B;
        result_Cevre=2*(A+B);
        System.out.print("Dikdortgenin  Alanı =>"+result_Alan+" "+ "Dikdortgenin Çevresi => "+ result_Cevre);
    }
    public static void main(String[] args)
    {
        int İslem;
        do {
            Menu();

        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("İşlem Seçiniz : ");
         İslem=input.nextInt();

        int Number_1;
        int Number_2;
        switch (İslem)
        {
            case 1:
                System.out.print("Birinci Sayi Giriniz =>");
                 Number_1=input.nextInt();
                System.out.print("İkinci Sayi Giriniz =>");
                 Number_2=input.nextInt();
                Toplama(Number_1,Number_2);
                System.out.println();
                break;
            case 2:
                System.out.print("Birinci Sayi Giriniz =>");
                Number_1=input.nextInt();
                System.out.print("İkinci Sayi Giriniz =>");
                Number_2=input.nextInt();
                Cıkarma(Number_1,Number_2);
                System.out.println();
                break;
            case 3:
                System.out.print("Birinci Sayi Giriniz =>");
                Number_1=input.nextInt();
                System.out.print("İkinci Sayi Giriniz =>");
                Number_2=input.nextInt();
                Carpma(Number_1,Number_2);
                System.out.println();
                break;
            case 4:
                System.out.print("Birinci Sayi Giriniz =>");
                Number_1=input.nextInt();
                System.out.print("İkinci Sayi Giriniz =>");
                Number_2=input.nextInt();
                Bolme(Number_1,Number_2);
                System.out.println();
                break;
            case 5:
                System.out.print("Birinci Sayi Giriniz =>");
                Number_1=input.nextInt();
                System.out.print("Ust Sayini Giriniz =>");
                Number_2=input.nextInt();
                Ust_Alma(Number_1,Number_2);
                System.out.println();
                break;
            case 6:
                System.out.print("Birinci Sayi Giriniz =>");
                Number_1=input.nextInt();
                Faktoriyel(Number_1);
                System.out.println();
                break;
            case 7:
                System.out.print("Birinci Sayi Giriniz =>");
                Number_1=input.nextInt();
                System.out.print("İkinci Sayi Giriniz =>");
                Number_2=input.nextInt();
                Mod_Alma(Number_1,Number_2);
                System.out.println();
                break;
            case 8:
                System.out.print("Uzun Kenarı Giriniz =>");
                Number_1=input.nextInt();
                System.out.print("Kısa Kenarı Giriniz =>");
                Number_2=input.nextInt();
                Dik_Alan_Cevre(Number_1,Number_2);
                System.out.println();
                break;
            default:
            {
                System.out.println("Hatalı Bir İşlem Girdiniz ");
            }
        }
        }while (İslem!=0);
        {
            
        }
    }
}
