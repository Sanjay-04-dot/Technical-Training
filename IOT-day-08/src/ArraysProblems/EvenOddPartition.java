package ArraysProblems;
public class EvenOddPartition {
    public static void main(String[] args) {

        long start=System.nanoTime();

        int arr[] = {5, 2, 8, 7, 1, 6,9,7,6};
        int arr1[] = new int[arr.length];
        int l = 0, r = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr1[l] = arr[i];
                l++;
            } else {
                arr1[r] = arr[i];
                r--;
            }
        }


        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" "+arr1[i]);
        }
        System.out.println();
        long end= System.nanoTime();
        long time=end-start;
        System.out.println("Time: "+time);
    }
}


