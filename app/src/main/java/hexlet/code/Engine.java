package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    private static final Scanner SC = new Scanner(System.in);

    public static String getUserAnswer() {
        System.out.print("Your answer: ");
        return SC.nextLine();
    }

    public static void runGame(String description, String[][] roundData) {
        String name = greetUserAndAskName();
        System.out.println(description);
        int i = 0;
        while (i < ROUNDS) {
            String task = roundData[i][0];
            System.out.println("Question: " + task);
            String userAnswer = getUserAnswer();
            String rightAnswer = roundData[i][1];
            if (rightAnswer.equals(userAnswer)) {
                i++;
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                        + "Let's try again, %s!\n", userAnswer, rightAnswer, name);
                System.exit(0);
            }
        }
        System.out.printf("Congratulations, %s!\n", name);
    }

    private static String greetUserAndAskName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = SC.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

}
