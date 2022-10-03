package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class CalcGame {

    private static final Random RANDOMIZER = new Random();
    private static final String[] OPERATIONS = {"+", "-", "*"};
    private static int val1;
    private static int val2;
    private static String operation;
    private static String expression;
    private static final Scanner SC = new Scanner(System.in);
    private static final int VALUES_BOUND = 10;
    private static final int OPERATIONS_BOUND = 3;

    public static int play(String gamerName) {

        val1 = RANDOMIZER.nextInt(VALUES_BOUND) + 1;
        val2 = RANDOMIZER.nextInt(VALUES_BOUND) + 1;

        operation = OPERATIONS[RANDOMIZER.nextInt(OPERATIONS_BOUND)];
        expression = String.format("%s %s %s", val1, operation, val2);
        System.out.println("Question: " + expression);
        int correctResult = getOperationResult(operation);
        System.out.print("Your answer: ");
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


    private static int getOperationResult(String operationType) {
        switch (operationType) {
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            case "*":
                return val1 * val2;
            default:
                throw new RuntimeException("Неизвестный вид операции");

        }
    }
}
