package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class PrimeGame {
    private static final int BOUND = 30;
    private static final Scanner SC = new Scanner(System.in);

    public static int play(String gamerName) {
        int random = new Random().nextInt(BOUND) + 1;
        System.out.println("Question: " + random);
        System.out.print("Your answer: ");

        boolean isPrime = isPrime(random);
        String userAnswer = SC.nextLine();
        String correctAnswer = isPrime ? "yes" : "no";
        if (correctAnswer.equalsIgnoreCase(userAnswer)) {
            System.out.println("Correct!");
            return 1;
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                    + "Let's try again, %s!\n", userAnswer, correctAnswer, gamerName);
            return 0;
        }
    }

    private static boolean isPrime(int candidate) {

        if (candidate == 1) {
            return true;
        }
        int divsorsCount = 0;
        for (int i = 1; i <= candidate; i++) {
            if (candidate % i == 0) {
                divsorsCount++;
            }
        }
        return divsorsCount == 2;
    }
}
