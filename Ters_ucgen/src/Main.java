import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Basamak sayısını giriniz : ");
        int basamak = input.nextInt();

        for (int i = 1; i <= basamak; i++) {
            for (int j = 1; j < i; j++)
                System.out.print(" ");
            for (int k = basamak*2; (2*i)-1 < k; k--)
                System.out.print("*");
            System.out.println(""); //yeni satıra atlaması icin
        }
    }
}
