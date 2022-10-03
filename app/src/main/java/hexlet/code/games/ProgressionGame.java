package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class ProgressionGame {

    private static final Random RANDOMIZER = new Random();
    private static final int PROGRESSION_ARRAY_LENGTH = 10;
    private static final String[] PROGRESSION_ARRAY = new String[PROGRESSION_ARRAY_LENGTH];
    private static int skippedIndex;
    private static String correctResult;
    private static final Scanner SC = new Scanner(System.in);
    private static final int FIRST_ELEMENT_BOUND = 20;
    private static final int STEP_BOUND = 5;

    public static int play(String gamerName) {
        System.out.println("Question: " + generateProgression());
        System.out.print("Your answer: ");
        String userAnswer = SC.nextLine();
        boolean correctAnswer = userAnswer.equals(correctResult);
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

    private static String generateProgression() {

        int firstElem = RANDOMIZER.nextInt(FIRST_ELEMENT_BOUND) + 1;

        int step = RANDOMIZER.nextInt(STEP_BOUND) + 1;

        PROGRESSION_ARRAY[0] = String.valueOf(firstElem);
        for (int i = 0; i < PROGRESSION_ARRAY.length - 1; i++) {
            int nextElement = Integer.parseInt(PROGRESSION_ARRAY[i]) + step;
            PROGRESSION_ARRAY[i + 1] = String.valueOf(nextElement);
        }
        skippedIndex = RANDOMIZER.nextInt(PROGRESSION_ARRAY.length);
        correctResult = PROGRESSION_ARRAY[skippedIndex];
        PROGRESSION_ARRAY[skippedIndex] = "..";
        System.out.println();
        return String.join(" ", PROGRESSION_ARRAY);

    }

}
