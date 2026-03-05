package twoDarray;

public class TwoDarrayExample {
    public static void main(String[] args) {

        int arr[][];
        arr=new int[20][20];

        int [][]matrix;
        matrix= new int[][]{{1, 2, 3,4}, {5, 4, 6}};

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
                System.out.println(matrix[i][j]);
        }
  ;  }
}
