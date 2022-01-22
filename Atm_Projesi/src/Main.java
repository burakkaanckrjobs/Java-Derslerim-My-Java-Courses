import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String userName,password;
        int right=3;
        int balance=1500;
        int Yatırma,Cekme;
        int select;


        while (right>0)
        {
            System.out.println("Kulanıcı Adınız : ");
            userName=input.nextLine();
            System.out.println("Parolanız : ");
            password=input.nextLine();


            if(userName.equals("patika")&&password.equals("dev123")) {
                System.out.println("İşlemler" + "\n" +
                        "1 = Para Yatırma" + "\n" +
                        "2 = Para Çekme" + "\n"
                        + "3 = Bakiye Sorgulama" + "\n" +
                        "4 = Çıkış Yap");

                System.out.println("Lütfen Bir işlem Geçiniz");
                select = input.nextInt();

                switch (select) {

                    case 1:
                        System.out.print("Yatırmak İstediğiniz  Tutar :");
                        Yatırma = input.nextInt();
                        balance += Yatırma;

                    case 2:
                        System.out.print("Çekmek İstediginiz Tutar :");
                        Cekme = input.nextInt();
                        if (Cekme <= balance) {
                            balance -= Cekme;
                            System.out.println("Çekme İşlemi Başarılı");
                        } else {
                            System.out.println("Bakiyeniz Yetersiz");
                        }
                    case 3:
                        System.out.println("Bankadaki Bakiyeniz : " + balance);
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        System.out.println(" ");
                        break;
                    default:
                        System.out.println("Hatalı Bir İşlem Girdiniz ");
                }
            }
            else
            {
                right--;
                System.out.println("Hatalı Kullanıcı adı veye Sifre. Tekrar Deneyiniz");
            }
            if(right==0)
            {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            }
            else
            {
                System.out.println("Kalan Hakkınız : " + right);
            }
        }
    }
}
