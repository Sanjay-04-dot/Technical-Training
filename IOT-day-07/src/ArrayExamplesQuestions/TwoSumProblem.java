package ArrayExamplesQuestions;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15,2,8,1};
        int target = 9;
        int i, j;
        int element = 2;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Target found at index "+i+" and "+j);
                }
            }
        }
    }

}

