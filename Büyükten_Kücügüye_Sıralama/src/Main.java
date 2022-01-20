import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int A,B,C;
        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayı Giriniz : ");
        A=input.nextInt();
        System.out.print("2 Sayı Giriniz : ");
        B=input.nextInt();
        System.out.print("3. Sayı Giriniz : ");
        C=input.nextInt();
        if((A > B) && (A>C))
        {
            if(B>C)
            {
                System.out.println("A > B > C");
            }
            else
            {
                System.out.println("A > C > B");
            }

        }
        else if ((B>A)&&(B>C))
        {
            if(A>C)
            {
                System.out.println("B > A > C");
            }
            else
            {
                System.out.println("B > C > A");
            }
        }
        else
        {
          if (B>A)
          {
              System.out.println("C > B > A");
          }
          else
          {
              System.out.println("C > A >B");
          }
        }
    }
}
