package Arrays;

public class ReverseArray {
    public static void main(String[] args) {

//        reversing an array using 2 pointer approach
        int []arr={15,91,56,82,45,80,99,1000,856,88};
        for(int i:arr)
        System.out.print(i+" ");

        int start=0,end=arr.length-1;

        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        System.out.println();
        for(int j:arr)
            System.out.print(j+" ");
    }
}
