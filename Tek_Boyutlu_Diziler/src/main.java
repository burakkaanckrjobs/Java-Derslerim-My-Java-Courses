public class main {

    public static void main(String[] args) {
        String[] Days={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma"};
        String[] weekendays = {"Cumartesi","Pazar"};
        String[] weekend =new String[7];

        for (int i=0;i<weekend.length;i++)
        {
            if(i<Days.length)
            {
                weekend[i]=Days[i];
            }
            else
            {
                weekend[i]=weekendays[i- Days.length];
            }
        }
        ArrayPrint(weekend);
    }
     static void ArrayPrint(String[] Weekend)
     {
         for(int i = 0; i<Weekend.length;i++)
         {
             System.out.println((i+1)+". Gün -> "+Weekend[i]);
         }
     }
}
