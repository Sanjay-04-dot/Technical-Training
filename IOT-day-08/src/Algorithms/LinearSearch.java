package Algorithms;

public class LinearSearch {
    static int LinearSearchAlgo(int key, int[] arr) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
//                break;
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 2, 7, 1, 18, 20, 11, 36};
        int key = 11;

        System.out.println("Element found at: "+LinearSearch.LinearSearchAlgo(key, arr));
    }
}




