import java.util.Scanner;

public class Main {

    static  int Ust_Alma(int A,int Ust)
    {
        int result;
        if(Ust==0)
            result=1;
        else
         result= A*Ust_Alma(A,Ust-1);
         return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayı Giriniz : ");
        int Number =input.nextInt();
        System.out.print("Lutfen Bir Ust Giriniz : ");
        int Ust =input.nextInt();
        System.out.println("-------");
        System.out.println(Ust_Alma(Number,Ust));


    }
}
