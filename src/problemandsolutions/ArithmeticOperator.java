package problemandsolutions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("You may enter teh first number below");
    int first_Number = input.nextInt();
    System.out.println("You may enter the second number below");
    int second_Number = input.nextInt();

    int summation = first_Number + second_Number;
    int substraction = first_Number - second_Number;
    int multiplicaiton = first_Number*second_Number;
    float division = (float) first_Number/second_Number;

        System.out.println("The result of adding is: "+summation);
        System.out.println("The result of substracting is: "+substraction);
        System.out.println("The result of multiplication is: "+multiplicaiton);
        System.out.println("The result of division is: "+division);
    }



}
