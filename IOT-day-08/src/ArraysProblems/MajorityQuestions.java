package ArraysProblems;

public class MajorityQuestions {
    public static void main(String[] args) {

        int [] arr={2,2,1,2,3,2,2};
        int []freq=new int[arr.length];
        int count=0,cut=0;

        while(arr.length>cut) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == count)
                    freq[count]++;
            }
            count++;
            cut++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(freq[i]>arr.length/2)
            {
                System.out.println("Majority Element:  "+freq[i]);
            }
        }
    }
}
