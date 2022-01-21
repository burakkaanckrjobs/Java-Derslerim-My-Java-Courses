import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int Yas,Yolculuk_Tipi,İslemler;
        double Mesafe,Yas_indirim,Gidiş_Dönüş_Bilet,Toplam_Tutar,Normal_Tutar,Yas_indirim_Oranı,İndirim_Tutarı;

        System.out.println("Lütfen Gideniz Rotanızı  Şeçiniz ");

            System.out.println("İstanbul -  Trabzon = 1100  = 1"+"\n"
                           +"İstanbul -  Urfa    = 1600  = 2 "+"\n"
                           +"İstanbul -  Antep   = 1400  = 3"+"\n"
                           +"İstanbul -  Antalya = 1500  = 4"+"\n");
            System.out.print("Rotanız : ");
                İslemler=input.nextInt();
        System.out.println();
            System.out.println("Yolculuk Tipleri ");
            System.out.println("Tek Yön     = 1" +"\n"+
                               "Gidiş Dönüş = 2");
        System.out.print("Yolculuk Tipiniz : ");
            Yolculuk_Tipi=input.nextInt();
        System.out.println();
            System.out.print("Lütfem Yaşınızı Giriniz : ");
                Yas=input.nextInt();

        switch (İslemler)
        {
            case 1:
                Mesafe=1100;
                if(Yas<12)
                {
                    Yas_indirim_Oranı=0.50;
                    Normal_Tutar=Mesafe*0.10;
                    Yas_indirim=Normal_Tutar*Yas_indirim_Oranı;
                    İndirim_Tutarı=Normal_Tutar-Yas_indirim;
                    if (Yolculuk_Tipi==2)
                    {
                        Gidiş_Dönüş_Bilet= İndirim_Tutarı*0.20;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    else
                    {
                        Gidiş_Dönüş_Bilet=0;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    System.out.println("Toplam Tutar : "+Toplam_Tutar+" TL");
                    break;
                }
                else if(Yas>=12 && Yas<=24)
                {
                    Yas_indirim_Oranı=0.10;
                    Normal_Tutar=Mesafe*0.10;
                    Yas_indirim=Normal_Tutar*Yas_indirim_Oranı;
                    İndirim_Tutarı=Normal_Tutar-Yas_indirim;
                    if (Yolculuk_Tipi==2)
                    {
                        Gidiş_Dönüş_Bilet= İndirim_Tutarı*0.20;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    else
                    {
                        Gidiş_Dönüş_Bilet=0;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    System.out.println("Toplam Tutar : "+Toplam_Tutar+" TL");
                    break;
                }
                else if(Yas>=65)
                {
                    Yas_indirim_Oranı=0.30;
                    Normal_Tutar=Mesafe*0.10;
                    Yas_indirim=Normal_Tutar*Yas_indirim_Oranı;
                    İndirim_Tutarı=Normal_Tutar-Yas_indirim;
                    if (Yolculuk_Tipi==2)
                    {
                        Gidiş_Dönüş_Bilet= İndirim_Tutarı*0.20;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    else
                    {
                        Gidiş_Dönüş_Bilet=0;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    System.out.println("Toplam Tutar : "+Toplam_Tutar+" TL");
                    break;
                }
            case 2 :
                Mesafe=1600;
                if(Yas<12)
                {
                    Yas_indirim_Oranı=0.50;
                    Normal_Tutar=Mesafe*0.10;
                    Yas_indirim=Normal_Tutar*Yas_indirim_Oranı;
                    İndirim_Tutarı=Normal_Tutar-Yas_indirim;
                    if (Yolculuk_Tipi==2)
                    {
                        Gidiş_Dönüş_Bilet= İndirim_Tutarı*0.20;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    else
                    {
                        Gidiş_Dönüş_Bilet=0;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    System.out.println("Toplam Tutar : "+Toplam_Tutar+" TL");
                    break;
                }
                else if(Yas>=12 && Yas<=24)
                {
                    Yas_indirim_Oranı=0.10;
                    Normal_Tutar=Mesafe*0.10;
                    Yas_indirim=Normal_Tutar*Yas_indirim_Oranı;
                    İndirim_Tutarı=Normal_Tutar-Yas_indirim;
                    if (Yolculuk_Tipi==2)
                    {
                        Gidiş_Dönüş_Bilet= İndirim_Tutarı*0.20;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    else
                    {
                        Gidiş_Dönüş_Bilet=0;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    System.out.println("Toplam Tutar : "+Toplam_Tutar+" TL");
                    break;
                }
                else if(Yas>=65)
                {
                    Yas_indirim_Oranı=0.30;
                    Normal_Tutar=Mesafe*0.10;
                    Yas_indirim=Normal_Tutar*Yas_indirim_Oranı;
                    İndirim_Tutarı=Normal_Tutar-Yas_indirim;
                    if (Yolculuk_Tipi==2)
                    {
                        Gidiş_Dönüş_Bilet= İndirim_Tutarı*0.20;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    else
                    {
                        Gidiş_Dönüş_Bilet=0;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    System.out.println("Toplam Tutar : "+Toplam_Tutar+" TL");
                    break;
                }
            case 3 :
                Mesafe=1400;
                if(Yas<12)
                {
                    Yas_indirim_Oranı=0.50;
                    Normal_Tutar=Mesafe*0.10;
                    Yas_indirim=Normal_Tutar*Yas_indirim_Oranı;
                    İndirim_Tutarı=Normal_Tutar-Yas_indirim;
                    if (Yolculuk_Tipi==2)
                    {
                        Gidiş_Dönüş_Bilet= İndirim_Tutarı*0.20;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    else
                    {
                        Gidiş_Dönüş_Bilet=0;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    System.out.println("Toplam Tutar : "+Toplam_Tutar+" TL");
                    break;
                }
                else if(Yas>=12 && Yas<=24)
                {
                    Yas_indirim_Oranı=0.10;
                    Normal_Tutar=Mesafe*0.10;
                    Yas_indirim=Normal_Tutar*Yas_indirim_Oranı;
                    İndirim_Tutarı=Normal_Tutar-Yas_indirim;
                    if (Yolculuk_Tipi==2)
                    {
                        Gidiş_Dönüş_Bilet= İndirim_Tutarı*0.20;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    else
                    {
                        Gidiş_Dönüş_Bilet=0;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    System.out.println("Toplam Tutar : "+Toplam_Tutar+" TL");
                    break;
                }
                else if(Yas>=65)
                {
                    Yas_indirim_Oranı=0.30;
                    Normal_Tutar=Mesafe*0.10;
                    Yas_indirim=Normal_Tutar*Yas_indirim_Oranı;
                    İndirim_Tutarı=Normal_Tutar-Yas_indirim;
                    if (Yolculuk_Tipi==2)
                    {
                        Gidiş_Dönüş_Bilet= İndirim_Tutarı*0.20;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    else
                    {
                        Gidiş_Dönüş_Bilet=0;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    System.out.println("Toplam Tutar : "+Toplam_Tutar+" TL");
                    break;
                }
            case 4:
                Mesafe=1500;
                if(Yas<12)
                {
                    Yas_indirim_Oranı=0.50;
                    Normal_Tutar=Mesafe*0.10;
                    Yas_indirim=Normal_Tutar*Yas_indirim_Oranı;
                    İndirim_Tutarı=Normal_Tutar-Yas_indirim;
                    if (Yolculuk_Tipi==2)
                    {
                        Gidiş_Dönüş_Bilet= İndirim_Tutarı*0.20;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    else
                    {
                        Gidiş_Dönüş_Bilet=0;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    System.out.println("Toplam Tutar : "+Toplam_Tutar+" TL");
                    break;
                }
                else if(Yas>=12 && Yas<=24)
                {
                    Yas_indirim_Oranı=0.10;
                    Normal_Tutar=Mesafe*0.10;
                    Yas_indirim=Normal_Tutar*Yas_indirim_Oranı;
                    İndirim_Tutarı=Normal_Tutar-Yas_indirim;
                    if (Yolculuk_Tipi==2)
                    {
                        Gidiş_Dönüş_Bilet= İndirim_Tutarı*0.20;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    else
                    {
                        Gidiş_Dönüş_Bilet=0;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    System.out.println("Toplam Tutar : "+Toplam_Tutar+" TL");
                    break;
                }
                else if(Yas>=65)
                {
                    Yas_indirim_Oranı=0.30;
                    Normal_Tutar=Mesafe*0.10;
                    Yas_indirim=Normal_Tutar*Yas_indirim_Oranı;
                    İndirim_Tutarı=Normal_Tutar-Yas_indirim;
                    if (Yolculuk_Tipi==2)
                    {
                        Gidiş_Dönüş_Bilet= İndirim_Tutarı*0.20;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    else
                    {
                        Gidiş_Dönüş_Bilet=0;
                        Toplam_Tutar=(İndirim_Tutarı-Gidiş_Dönüş_Bilet)*2;
                    }
                    System.out.println("Toplam Tutar : "+Toplam_Tutar+" TL");
                    break;
                }
            default:
                System.out.println("Hatalı Rota Girdiniz : ");
        }
    }
}
