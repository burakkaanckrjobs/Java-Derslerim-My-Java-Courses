import java.util.Scanner;

public class Main {

    static  int İsAsal(int A,int Sayac)
    {
     if(Sayac==1)
         return 1;
     else
     {
         if(A%Sayac==0)
             return 0;
         else
             return İsAsal(A,Sayac-1);
     }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Bir Sayı Giriniz :");
        int Number= input.nextInt();
        int İs_prime =İsAsal(Number,Number/2);
        if(İs_prime==1)
            System.out.println(Number+" Sayisi Asaldir");
        else
            System.out.println(Number+"Sayisi Asal Degildir");
    }
}
