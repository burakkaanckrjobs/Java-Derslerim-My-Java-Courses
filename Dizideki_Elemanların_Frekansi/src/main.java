public class main {
    public static void main(String[] args)
    {
        int[] Dizi ={10, 20, 20, 10, 10, 20, 5, 20};
        int Tekrar_1 =0;
        int Tekrar_2 =0;
        int Tekrar_3=0;
        for (int i =0;i<Dizi.length;i++)
        {
            if(Dizi[i]==5)
            {
                Tekrar_1++;
            }
        }
        for (int i =0;i<Dizi.length;i++)
        {
            if(Dizi[i]==10)
            {
                Tekrar_2++;
            }
        }
        for (int i =0;i<Dizi.length;i++)
        {
            if(Dizi[i]==20)
            {
                Tekrar_3++;
            }
        }

        System.out.println("5 sayisi "+Tekrar_1+" kere tekrar etti");
        System.out.println("10 sayisi "+Tekrar_2+" kere tekrar etti");
        System.out.println("20 sayisi "+Tekrar_3+" kere tekrar etti");
    }
}
