package ArrayExamplesQuestions;

import java.util.Arrays;

public class FindMissingDistinctNumbers {
    public static void main(String[] args) {

        int arr[]={1,2,3,5,6};
        int sum=6*(6+1)/2;

        int arrsum=0;
        for(int i=0;i<arr.length;i++)
        {
            arrsum+=arr[i];
        }

        System.out.println("Missing Number: "+(sum-arrsum));

    }
}
