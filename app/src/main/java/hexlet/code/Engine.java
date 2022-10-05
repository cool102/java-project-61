package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND = 3;
    private static String gamerName = "";
    private static String task;
    private static int rightAnswersCounter = 0;
    private static Scanner scanner = new Scanner(System.in);

    private static String userAnswer;
    private static String gameAnswer;


    public static void printTask() {
        System.out.println("Question: " + task);
    }

    public static void setTask(String taskName) {
        Engine.task = taskName;
    }

    public static void setUserAnswer(String answer) {
        Engine.userAnswer = answer;
    }

    public static void setGameAnswer(String trueAnswer) {
        Engine.gameAnswer = trueAnswer;
    }

    public static void setGamerName(String name) {
        Engine.gamerName = name;
    }

    public static void getUserAnswer() {
        System.out.print("Your answer: ");
        userAnswer = scanner.nextLine();
    }

    public static void makeDecision() {
        while (rightAnswersCounter < ROUND) {
            printTask();
            getUserAnswer();
            if (gameAnswer.equals(userAnswer)) {
                rightAnswersCounter++;
                System.out.println("Correct!");
                if (rightAnswersCounter == ROUND) {
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
