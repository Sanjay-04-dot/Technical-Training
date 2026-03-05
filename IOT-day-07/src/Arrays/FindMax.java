package Arrays;

public class FindMax {
    public static void main(String[] args) {
        int []arr={15,91,56,82,45,80,99};
        int max=arr[0];

        for(int i:arr)
        {
            if(max<i)
            {
                max=i;
            }
        }
        System.out.println(max);
    }
}
