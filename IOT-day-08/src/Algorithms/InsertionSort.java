package Algorithms;

public class InsertionSort {

    static void insertion(int [] arr)
    {
        for(int i=1;i< arr.length;i++) {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int [] arr={2,4,1,2,6,3,5,2};

        InsertionSort.insertion(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
