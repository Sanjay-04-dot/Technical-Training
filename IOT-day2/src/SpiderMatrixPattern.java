import java.util.Scanner;

public class SpiderMatrixPattern {
    public static void main(String[] args) {
        int i, j;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int [][]a=new int[n][n];
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        int num=1;


        while(top<=bottom && left<=right)
        {
            for(i=left;i<=right;i++)
            {
                a[top][i]=num++;
            }
            top++;

            for(i=top;i<=bottom;i++)
            {
                a[i][right]=num++;
            }
            right--;

            for(i=right;i>=left;i--)
            {
                a[bottom][i]=num++;
            }
            bottom--;

            for(i=bottom;i>=top;i--)
            {
                a[i][left]=num++;
            }
            left++;
        }

        for(i=0;i<n;i++) {
            for (j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
