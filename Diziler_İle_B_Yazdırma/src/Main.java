public class Main {
        public static void main(String[] args) {
            char[][] A= new char[7][4];

            for(int i=0; i<A.length;i++)
            {
                for (int j=0;j<A[i].length;j++)
                {
                    if(i==0 || i==3 || i==6)
                    {
                        A[i][j]='*';
                    }
                    else if(j==0 || j==3)
                    {
                        A[i][j]='*';
                    }
                    else
                    {
                        A[i][j]=' ';
                    }

                }
            }

            for (int i =0;i<A.length;i++)
            {
                for (int j=0;j<A[i].length;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }


