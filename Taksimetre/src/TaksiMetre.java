import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class TaksiMetre {
    public static void main(String[] args) {
            double perKm =2.20,Total=10;
            int Km;
        Scanner input = new Scanner(System.in);

        System.out.print("Km Bilgisini Giriniz : ");
        Km=input.nextInt();

        Total+=Km*perKm;
        Total=(Total<20)? 20: Total;
        System.out.println("");
        System.out.println(Km+"KMlik Yol Ücreti : "+Total);



    }
}
