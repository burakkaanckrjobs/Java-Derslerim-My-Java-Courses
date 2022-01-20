import java.util.Scanner;

public class Kdv_Hesaplama
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Urun;
        float Kdv = 1.18F;
        float Fiyat;
        System.out.print("Ürün Fiyatı : ");
        Urun = input.nextInt();
        System.out.println("");
        Fiyat=Kdv*Urun;
        System.out.println("Ürünün  Kdv Fiyatı : "+Fiyat);
    }
}
