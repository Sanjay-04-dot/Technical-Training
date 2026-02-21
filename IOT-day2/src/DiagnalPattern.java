import java.util.Scanner;

public class DiagnalPattern {
    public static void main(String[] args) {
        int i, j;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: \n");
//        int n = sc.nextInt();

        int n=4;
        int [][]a=new int[n][n];
        int num=1;
        for (int d = 0; d < 2 * n - 1; d++) {   // each diagonal
            int row = d < n ? d : n - 1;
            int col = d < n ? 0 : n - 1;

            while (row >=0 && col < n) {
                a[row][col] = num++;
                row--;
                col++;
            }
        }

        for(i=0;i<n;i++) {
            for (j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }

    }
}
