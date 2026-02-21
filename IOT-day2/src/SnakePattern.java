public class SnakePattern {
    public static void main(String[] args) {
        int i, j;
        int n = 4;
        int num=1;
        int[][] a;
        a=new int[n][n];


            for (i = 0; i < n; i++) {
                if ((i % 2) == 0) {
                    for (j = 0; j < n; j++)
                        a[i][j] = num++;
                } else {
                    for (j = n - 1; j >= 0; j--)
                        a[i][j] = num++;
                }
            }

            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++)
                    System.out.print(a[i][j]+" ");
                System.out.println();
            }

    }
}
