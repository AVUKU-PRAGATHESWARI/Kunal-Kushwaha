package Conditionals_loops.Intermediate;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Subjects do you have: ");
        int no_of_subjects = input.nextInt(),sum=0;
        for(int i=1;i<=no_of_subjects;i++){
            System.out.print("Enter "+i+" Subject Marks: ");
            int Subject = input.nextInt();
            sum+=Subject;
        }
        int average=sum/no_of_subjects;
        float cgpa= (float) (average*(100.0));
        System.out.println("Your CGPA is: "+cgpa);
    }

}
