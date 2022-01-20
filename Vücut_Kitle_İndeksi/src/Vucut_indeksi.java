import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class Vucut_indeksi {
    public static void main(String[] args) {

        int Kg;
        double Boy,index;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Giriniz : ");
        Boy=input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        Kg=input.nextInt();
        index=Kg/(Boy*Boy);
        System.out.println("Vücut indeksiniz : "+index);


    }
}
