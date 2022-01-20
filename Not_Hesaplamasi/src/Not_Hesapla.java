import java.util.Scanner;

public class Not_Hesapla {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

        // Matematik TURKCE FİZİK TARİH KİMYA;
        int M_Vize,M_Final,T_Vize,T_Final,F_Vize,F_Final,Ta_Vize,Ta_Final,K_Vize,K_Final;
        double M_Ort,T_Ort,F_Ort,Ta_Ort,K_Ort,Genel_Ort=0;

        //MATEMATİK ORT
        System.out.print("Lütfen Matematik Dersinin Vizesini Giriniz : ");
        M_Vize=input.nextInt();
        System.out.println(" ");
        System.out.print("Lütfen Matematik Dersinin Final Giriniz : ");
        M_Final=input.nextInt();
        System.out.println(" ");
        M_Ort=(M_Vize*0.4)+(M_Final*0.6);
        System.out.println("Dersin Not Ortalaması : "+M_Ort);
        System.out.println("");
        Genel_Ort+=M_Ort;

        //TURKÇE ORT
        System.out.print("Lütfen Turkçe Dersinin Vizesini Giriniz :");
        T_Vize=input.nextInt();
        System.out.println(" ");
        System.out.print("Lütfen Turkçe Dersinin Final Giriniz :");
        T_Final=input.nextInt();
        System.out.println(" ");
        T_Ort=(T_Vize*0.4)+(T_Final*0.6);
        System.out.println("Dersin Not Ortalaması : "+T_Ort);
        System.out.println("");
        Genel_Ort+=T_Ort;

        //FİZİK ORT
        System.out.print("Lütfen Fizik Dersinin Vizesini Giriniz :");
        F_Vize=input.nextInt();
        System.out.println(" ");
        System.out.print("Lütfen Fizik Dersinin Final Giriniz :");
        F_Final=input.nextInt();
        System.out.println(" ");
        F_Ort=(F_Vize*0.4)+(F_Final*0.6);
        System.out.println("Dersin Not Ortalaması : "+F_Ort);
        System.out.println("");
        Genel_Ort+=F_Ort;

        //Kimya ORT
        System.out.print("Lütfen Tarih Dersinin Vizesini Giriniz :");
        Ta_Vize=input.nextInt();
        System.out.println(" ");
        System.out.print("Lütfen Tarih Dersinin Final Giriniz :");
        Ta_Final=input.nextInt();
        System.out.println(" ");
        Ta_Ort=(Ta_Vize*0.4)+(Ta_Final*0.6);
        System.out.println("Dersin Not Ortalaması : "+Ta_Ort);
        System.out.println("");
        Genel_Ort+=Ta_Ort;

        //TARİH ORT
        System.out.print("Lütfen Kimya Dersinin Vizesini Giriniz :");
        K_Vize=input.nextInt();
        System.out.println(" ");
        System.out.print("Lütfen Kimya Dersinin Final Giriniz :");
        K_Final=input.nextInt();
        System.out.println(" ");
        K_Ort=(K_Vize*0.4)+(K_Final*0.6);
        System.out.println("Dersin Not Ortalaması : "+K_Ort);
        System.out.println("");
        Genel_Ort+=K_Ort;
        System.out.println("Genel Not Ortalaması : "+Genel_Ort/5);

        boolean Sınıv_Gecti_Mi = Genel_Ort>=60;
        String Str = Sınıv_Gecti_Mi ? " Geçti ":"Kaldı";










    }
}
