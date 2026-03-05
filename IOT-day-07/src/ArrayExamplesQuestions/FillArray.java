package ArrayExamplesQuestions;

public class FillArray {
        public static void main(String[] args) {

            int [] arr=new int[10000];

            int l = 4000, r=5500;

//            Array filling from 4000 to 5500 fill:- 5

            for (int i = l; i <= r; i++)
                arr[i] = 5;

            for (int i = 0; i <arr.length; i++)
                System.out.print(arr[i]+" ");

        }
}
