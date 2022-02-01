import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String Str_input;
        String Str="";
        boolean İsPalindromi=false;

        Scanner input= new Scanner(System.in);

        System.out.print("Palindromik Kelime' Giriniz ");
        Str_input=input.nextLine();

        int length=Str_input.length();

        for(int i =length-1;i>=0;i--)
        {
            Str+=Str_input.charAt(i);
        }
        for(int j =0;j<length;j++)
        {
          if(Str.charAt(j)==Str_input.charAt(j))
          {
              İsPalindromi=true;
          }
          else
          {
              İsPalindromi=false;
          }
        }
        if(İsPalindromi)
        {
            System.out.println("Yazdıgınız Kelime : "+Str_input + " ile "+" Palindromik Hali :"+ Str+" Eşitir");
        }
        else {
            System.out.println("Yazdıgınız Kelime : "+Str_input + " ile "+" Palindromik Hali :"+ Str+" Eşitir Değildir");
        }
    }
}
