import java.util.Random;

public class main {
    static  boolean İsCift(int[]Arr,int val)
    {
        for (int i:Arr)
        {
            if(i==val)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]Number =new int[20];
        int[]Cift=new int[Number.length];
        int[]Tek=new int[Number.length];
        int starIndex=0;
        int starIndex_1=0;
        Random Rnd =new Random();
        for (int i =0;i<Number.length;i++)
        {
            Number[i]=Rnd.nextInt(2,50);
        }
        for(int k=0;k<Number.length;k++)
        {
            for (int j =0;j<Number.length;j++)
            {
                if((k!=0)&&(Number[k]==Number[j]))
                {
                    if(!İsCift(Cift,Number[k]))
                    {
                        if(Number[k]%2==0)
                        {
                            Cift[starIndex++]=Number[k];
                        }
                        else
                        {
                            if(!İsCift(Tek,Number[k]))
                            Tek[starIndex_1++] = Number[k];
                        }
                    }
                }
            }
        }
        System.out.print("Normal  Dizi: ");
        System.out.print("{");
        for (int a :Number) {
            System.out.print(a+",");
        }
        System.out.print("}");

        System.out.println();
        System.out.print("Cift Dizi : ");
        System.out.print("{");
        for (int i :Cift)
        {
            if(i!=0) {
                System.out.print(i + ",");
            }
        }
        System.out.print("}");
        System.out.println();
        System.out.print("Tek Dizi : ");
        System.out.print("{");
        for (int k :Tek)
        {
            if(k!=0) {
                System.out.print(k + ",");
            }
        }
        System.out.print("}");
    }
}
