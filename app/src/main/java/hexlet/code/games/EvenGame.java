package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    private static final int BOUND = 20;
    private static final Scanner SC = new Scanner(System.in);

    public static int play(String gamerName) {

        int random = new Random().nextInt(BOUND) + 1;
        System.out.println("Question: " + random);
        System.out.print("Your answer: ");
        boolean randomIsEven = (random % 2 == 0);
        String userAnswer = SC.nextLine();
        String correctAnswer = randomIsEven ? "yes" : "no";
        int counter = 0;
        if (correctAnswer.equalsIgnoreCase(userAnswer)) {
            System.out.println("Correct!");
            counter++;
            return counter;
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                    + "Let's try again, %s!\n", userAnswer, correctAnswer, gamerName);
            return 0;
        }


    }


}
