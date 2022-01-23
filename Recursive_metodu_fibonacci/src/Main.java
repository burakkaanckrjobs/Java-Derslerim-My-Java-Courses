public class Main   {


    static  int Fibonacci(int N)
    {
        if(N==1 || N==2)
            return 1;
        return Fibonacci(N-1)+Fibonacci(N-2);
    }
    public static void main(String[] args) {

        System.out.println(Fibonacci(5));
    }
}
