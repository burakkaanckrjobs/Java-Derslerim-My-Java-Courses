import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int Month, Day;
        String Burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğdugunuz Ay : ");
        Month = input.nextInt();
        System.out.print("Dogdugunuz Gün : ");
        Day = input.nextInt();
        switch (Month)
        {
            case 1://Ocak
                if (Day >= 1 && Day <= 31)
                {
                    if (Day < 22) {
                        Burc="Oğlak";
                    } else {
                        Burc="Kova";
                    }
                }
                else
                {
                    isError= true;
                }
            case 2://Şubat
                if (Day >= 1 && Day <= 28)
                {
                    if (Day < 20)
                      {
                        Burc= "Kova";
                      }
                    else
                      {
                        Burc =" Balık";
                      }
                }
                else
                {
                    isError=true;
                }
            case 3://Mart
                if (Day >= 1 && Day <= 31)
                {
                    if (Day < 21)
                    {
                        Burc= "Balık";
                        break;
                    }
                    else
                    {
                        Burc =" Koç";
                        break;
                    }
                }
                else
                {
                    isError=true;
                    break;
                }
            case 4://Nisan
                if (Day >= 1 && Day <= 31)
                {
                    if (Day < 21)
                    {
                        Burc= "Koç";
                        break;
                    }
                    else
                    {
                        Burc =" Boga";
                        break;
                    }
                }
                else
                {
                    isError=true;
                    break;
                }
            case 5://Mayıs
                if (Day >= 1 && Day <= 31)
                {
                    if (Day < 20)
                    {
                        Burc= "Boga";
                        break;
                    }
                    else
                    {
                        Burc =" İkizler";
                        break;
                    }
                }
                else
                {
                    isError=true;
                    break;
                }
            case 6://Haziran
                if (Day >= 1 && Day <= 31)
                {
                    if (Day < 21)
                    {
                        Burc= "İkizler";
                        break;
                    }
                    else
                    {
                        Burc ="Yengeç";
                        break;
                    }
                }
                else
                {
                    isError=true;
                    break;
                }
            case 7://Temmuz
                if (Day >= 1 && Day <= 31)
                {
                    if (Day < 22)
                    {
                        Burc= "Yengeç";
                        break;
                    }
                    else
                    {
                        Burc ="Aslan";
                        break;
                    }
                }
                else
                {
                    isError=true;
                    break;
                }
            case 8://Agustos
                if (Day >= 1 && Day <= 31)
                {
                    if (Day < 23)
                    {
                        Burc= "Aslan";
                        break;
                    }
                    else
                    {
                        Burc ="Başak ";
                        break;
                    }
                }
                else
                {
                    isError=true;
                    break;
                }
            case 9://Eylül
                if (Day >= 1 && Day <= 31)
                {
                    if (Day < 23)
                    {
                        Burc= "Başak ";
                        break;
                    }
                    else
                    {
                        Burc ="Terazi";
                        break;
                    }
                }
                else
                {
                    isError=true;
                    break;
                }
            case 10://Ekim
                if (Day >= 1 && Day <= 31)
                {
                    if (Day < 23)
                    {
                        Burc= "Terazi ";
                        break;
                    }
                    else
                    {
                        Burc ="Akrep ";
                        break;
                    }
                }
                else
                {
                    isError=true;
                    break;
                }
            case 11://Kasım
                if (Day >= 1 && Day <= 31)
                {
                    if (Day < 22)
                    {
                        Burc= "Terazi ";
                        break;
                    }
                    else
                    {
                        Burc ="Akrep ";
                        break;
                    }
                }
                else
                {
                    isError=true;
                    break;
                }
            case 12://Aralık
                if (Day >= 1 && Day <= 31)
                {
                    if (Day < 22)
                    {
                        Burc= "Akrep ";
                        break;
                    }
                    else
                    {
                        Burc ="Oğlak  ";
                        break;
                    }
                }
                else
                {
                    isError=true;
                    break;
                }
            default:
                System.out.println("Hatalı Bir ay Girdiniz ");
        }
        if(isError)
        {
            System.out.println("Hatalı Giriş Yaptınız, Tekrar Deneyiz");
        }
        else
        {
            System.out.println("Burcunuz : "+ Burc);
        }
    }
}
