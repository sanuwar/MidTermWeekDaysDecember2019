package problemandsolutions;
import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.
    public static void main(String[] args) {
        int answer;
        final int MAX = 8;

        Random rand = new Random();

        answer = rand.nextInt(MAX) +1;

        System.out.println(answer);
    }
}