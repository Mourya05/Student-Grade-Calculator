import java.util.*;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }

        int avg = sum / n;
        char grade = ' ';

        if(avg >= 91 && avg <= 100 ){
            grade = 'S';
        }
        else if(avg >=  81 && avg < 91 ){
            grade = 'A';
        }
        else if(avg >= 71 && avg < 81 ){
            grade = 'B';
        }
        else if(avg >= 61 && avg < 71 ){
            grade = 'C';
        }
        else if(avg >= 51 && avg < 61 ){
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        System.out.println("The total marks are " + sum + " and the average percentage is " + avg);
        System.out.println("The grade obtained by the student is " + grade);

        sc.close();
    }
}