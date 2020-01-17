package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the Quiz Score ");
        int quizScore = input.nextInt();
        System.out.println("Enter the Midterm Score ");
        int midtermScore = input.nextInt();
        System.out.println("Enter the final Score ");
        int finalScore = input.nextInt();

        float totalScore = (float) (quizScore+midtermScore+finalScore)/3;

        if (totalScore >= 90){
            System.out.println("Your grade is A");
        }
        else if (totalScore >= 70){
            System.out.println("Your grade is B");
        }
        else if (totalScore >= 50){
            System.out.println("Your grade is C");
        }
        else if (totalScore < 50){
            System.out.println("You LOSER! Your grade is F");
        }
    }

}
