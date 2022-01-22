import java.util.Scanner;

public class Main
{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen N1 Sayısını Giriniz : ");
        int N1= input.nextInt();
        System.out.print("Lutfen N2 Sayısını Giriniz : ");
        int N2= input.nextInt();
        int Enk,i=1,k,a=1,ebob=0,ekok=0;
        if(N1<N2)
             {
                 Enk=N2;
                 k=N2;
            }
        else
            {
                 Enk=N1;
                 k=N1;
            }
        while (k>=1)
        {
            if(N1%k==0 && N2%k==0)
            {
                ebob=k;
                break;
            }
            k--;
        }
        while (a<=(N1*N2))
        {
            if(a%N1==0 && a%N2 ==0)
            {
                ekok=a;
                break;
            }
            a++;
        }
        System.out.println("Ekok  = "+ekok);
        System.out.println("Ebob  = "+ebob);
        System.out.println("EKOK= "+(N1*N2)/ebob);
    }
}
