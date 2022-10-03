package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GCDGame {
    private static final Random RANDOMIZER = new Random();
    private static int val1;
    private static int val2;
    private static final Scanner SC = new Scanner(System.in);
    private static final int[] ARRAY = new int[1];
    private static  final int VALUES_BOUND = 100;

    public static int play(String gamerName) {

        val1 = RANDOMIZER.nextInt(VALUES_BOUND) + 1;
        val2 = RANDOMIZER.nextInt(VALUES_BOUND) + 1;
        System.out.printf("Question: %s %s\n", val1, val2);
        int correctResult = getGCD(val1, val2);
        System.out.println("Your answer: ");
        String userAnswer = SC.nextLine();
        boolean correctAnswer = Integer.parseInt(userAnswer) == correctResult;
        int counter = 0;
        if (correctAnswer) {
            System.out.println("Correct!");
            counter++;
            return counter;

        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                    + "Let's try again, %s!\n", userAnswer, correctResult, gamerName);
            return 0;
        }
    }

    private static int getGCD(int x, int y) {
        if ((x > y) && (x % y == 0)) {
            return y;
        } else if ((y > x) & (y % x == 0)) {
            return x;
        } else if (x == y) {
            return x;
        } else if (x > y) {
            for (int i = 1; i < x; i++) {
                if (x % i == 0 && y % i == 0) {
                    ARRAY[0] = i;
                }
            }
            return ARRAY[0];
        } else {
            for (int i = 1; i < x; i++) {
                if (x % i == 0 && y % i == 0) {
                    ARRAY[0] = i;
                }
            }
            return ARRAY[0];
        }

    }
}
