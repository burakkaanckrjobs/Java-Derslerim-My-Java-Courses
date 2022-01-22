public class Main
{
    public static void main(String[] args) {

       int A=0,B=1,C;


        for (int i = 2; i<=10;i++)
        {
            C=A+B;
            System.out.println(C);
            A=B;
            B=C;
        }
    }
}
