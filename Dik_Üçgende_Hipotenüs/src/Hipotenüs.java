import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int B,A;
        double Alan,Cevre,U,H;



        System.out.println(" ");
        System.out.print("A Kenarını Giriniz : ");
        A=input.nextInt();
        System.out.println("");
        System.out.print("B Kenarını Giriniz :");
        B=input.nextInt();
        System.out.println("");
        H=Math.sqrt((A*A)+(B*B));
         U = (A+B+H)/2;
         Cevre=2*U;
        Alan =U*(U-A)*(U-B)*(U-H);
        System.out.println("Hipatenüs : "+ H);
        System.out.println("Üçgenin Çevresi : "+Cevre);
        System.out.println("");
        System.out.println("Üçgenin Alanı : "+Alan);





    }
}
