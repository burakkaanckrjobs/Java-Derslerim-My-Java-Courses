import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayı Giriniz : ");
        int A=input.nextInt();

        for(int i=0; i <=A;)
        {
            if(i%2==0)
            {
                System.out.println(i);
                i++;
            }
            else
            {
                i++;
            }
        }

    }
}
