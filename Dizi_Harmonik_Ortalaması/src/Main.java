import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] Harmonik = {1,2,3,4,5};
        double Harmonik_Ort=0;

      for (int i=0;i< Harmonik.length;i++)
      {
          Harmonik_Ort+=(1.0/Harmonik[i]);
      }
        System.out.println(Arrays.toString(Harmonik)+" Dizinsinin Harmonik ortalaması : " +Harmonik_Ort);
    }
}
