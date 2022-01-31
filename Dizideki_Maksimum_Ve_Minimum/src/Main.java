public class Main {

    public static void main(String[] args) {

        int[]arr = {56,34,1,8,101,-2,-33};
        // min arr[0] , min < arr[i] ? min = arr[i] :
        // max arr[0] , max > arr[i] ? min = arr[i] :,
        int min = arr[0];
        int max = arr[0];

        for (int i:arr)
        {
          if(i<min)
          {
              min = i;
          }
          if(i>max)
          {
              max=i;
          }

        }

        System.out.println("Minimum Deger : "+min+"\t Maxsium Deger : "+max);
    }
}
