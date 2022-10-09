package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String gamerName = "";
    private static int rightAnswersCounter = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void printTask(String task) {
        System.out.println("Question: " + task);
    }

    public static void setGamerName(String name) {
        gamerName = name;
    }

    public static String getUserAnswer() {
        System.out.print("Your answer: ");
        return scanner.nextLine();
    }

    public static void runRound(String task, String gameAnswer) {
        final int round = 3;
        while (rightAnswersCounter < round) {
            printTask(task);
            String userAnswer = getUserAnswer();
            if (gameAnswer.equals(userAnswer)) {
                rightAnswersCounter++;
                System.out.println("Correct!");
                if (rightAnswersCounter == round) {
                    break;
                } else {
                    return;
                }
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                        + "Let's try again, %s!\n", userAnswer, gameAnswer, gamerName);
                System.exit(0);
            }
        }
        System.out.printf("Congratulations, %s!\n", gamerName);
    }

}
