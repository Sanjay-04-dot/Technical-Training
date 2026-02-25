package Module1;

import java.util.Scanner;

public class StudentMarksGrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        char grade='A';
        while(true) {
            marks = sc.nextInt();
            if (marks > 100 || marks < 0) {
                System.out.println("Invalid Marks");
            }
            else{
                break;
            }
        }

        if(marks>=90)
            grade='A';
        else if (marks>=80)
            grade='B';
        else if (marks>=65)
            grade='C';
        else if (marks>=40)
            grade='C';
        else if(marks>=35)
            grade='D';
        else if (marks<35)
            grade='F';



        switch (grade)
        {
            case 'A':
                System.out.println(""+grade);
                break;
            case 'B':
                System.out.println(""+grade);
                break;
            case 'C':
                System.out.println(""+grade);
                break;
            case 'D':
                System.out.println(""+grade);
                break;
            case 'F':
                System.out.println("Fail");
                break;
        }
    }
}
