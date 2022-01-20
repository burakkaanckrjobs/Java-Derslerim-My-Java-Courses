import java.util.Scanner;

public class Kasa {
    public static void main(String[] args) {

        double Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlıcan=5.0;
        double Ar,El,Do,Mu,Pa;
        double T_Ar,T_El,T_Do,T_Mu,T_Pa,Total;

        Scanner input =new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ?");
        System.out.println(": ");
        Ar=input.nextDouble();
        T_Ar=Ar*Armut;

        System.out.println("Elma Kaç kilo ?");
        System.out.println(": ");
        El=input.nextDouble();
        T_El=El*Elma;

        System.out.println("Muz Kaç Kilo ? ");
        System.out.println(": ");
        Mu=input.nextDouble();
        T_Mu=Mu*Muz;

        System.out.println("Domates Kaç Kilo ?");
        System.out.println(": ");
        Do=input.nextDouble();
        T_Do=Do*Domates;

        System.out.println("Patlıcan Kaç Kilo ?");
        System.out.println(": ");
        Pa=input.nextDouble();
        T_Pa=Pa*Patlıcan;

        Total=T_Ar+T_El+T_Do+T_Mu+T_Pa;

        System.out.println("Armut Kg Fiyat : "+T_Ar+"TL \n"+"Elma Kg Fiyat : "+T_El+"TL \n"+"Muz Kg Fiyat : "+T_Mu+"TL \n"
                + "Domates Kg Fiyat : "+T_Do+"TL \n"+"Patlıcan Kg  Fiyat : "+T_Pa+"TL \n"
                +"Toplam Ödenecek Tutar : "+Total+"TL\nİyi Günler....");
    }
}
