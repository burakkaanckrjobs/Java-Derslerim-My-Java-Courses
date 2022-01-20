import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        String Kullanıcı_Adı;
        String Sifre;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Kullanıcı Adını Giriniz : ");
        Kullanıcı_Adı=input.nextLine();
        System.out.print("Sifrenizi Giriniz : ");
        Sifre=input.nextLine();

        if(Kullanıcı_Adı.equals("Admin")&& Sifre.equals("Admin"))
        {
            System.out.println("Giriş Başarılı");
        }
        else
        {
            System.out.println("Kullanıcı Adı veya Şifre Yanlıştır");
        }
    }
}
