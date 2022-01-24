import java.util.Scanner;

public class Main {

    static void Cizme(int A,int Temp,boolean X)
    {
        if (Temp <= 0) {
            X = false;
        }
        int nextStep = X ? (Temp - 5) : (Temp + 5) ;
        if(nextStep <= A){
            Cizme(A, nextStep,X );
        }
        System.out.print(Temp + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Giriniz : ");
        int N = input.nextInt();
        System.out.print("Çıktısı : ");
        Cizme(N,N,true);



    }
}
