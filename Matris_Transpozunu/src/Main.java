import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Number;
        int i, j;
        System.out.println("Oluşturulacak satır ve sutun sayısını gir");
        Number = in.nextInt();
        int[][] matris = new int[Number][Number]; //girilen sayı kadar çok boyutlu dizi oluşturur.
        int[][] transpoz = new int[Number][Number];
        for (i = 0; i < Number; i++) {
            for (j = 0; j < Number; j++) {
                System.out.println((i + 1) + "x" + (j + 1) + "sayıyı gir");
                matris[i][j] =in.nextInt();
                transpoz[i][j] = matris[i][j];
            }
        }
        for (i = 0; i < Number; i++) {  //transpoz alınmamış hali
            for (j = 0; j < Number; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        for (i = 0; i < Number; i++) {
            for (j = 0; j < Number; j++) {
                System.out.print(transpoz[j][i] + "\t"); //traspoz alınmış hali
            }
            System.out.println("");
        }

    }
}
