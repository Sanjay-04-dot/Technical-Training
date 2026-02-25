package Module1;

public class PyramidPattern {
    public static void main(String[] args) {

        int num1=7;

        String [][]a=new String[20][20];

//        int i,j=(num1/2)+1;
//        for (i=1;i<=num1;i++)
//        {
//
//            a[i][j]='*';
//
//        }
        int i,j;
        for (i=1;i<=num1;i++)
        {
            for(j=1;j<=num1;j++) {

                for(int k=(num1/2);k>0;k--)
                {
                    System.out.print();
                }

            }
        }


    }
}
