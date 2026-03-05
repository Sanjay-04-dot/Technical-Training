package ArrayExamplesQuestions;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr ={2,4,6,8,10,15};
        int[] prefix =new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            prefix[i]=sum;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+ prefix[i]);
        }

        //-------Prefix Sum Over------//

        //find the sum from index 3 to 5

        int l=3,r=5;
        sum=0;
        if(l==0)
            sum=prefix[r];
        else
            sum=prefix[r]-prefix[l-1];
        System.out.println();
        System.out.println(" "+sum);

    }
}
