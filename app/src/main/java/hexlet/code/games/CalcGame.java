package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class CalcGame {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};
    private static final int VALUES_BOUND = 10;

    public static void run() {
        Random randomizer = new Random();
        int operationsBound = OPERATIONS.length;
        String[][] roundsData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int val1 = randomizer.nextInt(VALUES_BOUND) + 1;
            int val2 = randomizer.nextInt(VALUES_BOUND) + 1;
            String operationType = OPERATIONS[randomizer.nextInt(operationsBound)];
            String task = String.format("%s %s %s", val1, operationType, val2);
            String correctAnswer = String.valueOf(getOperationResult(operationType, val1, val2));
            roundsData[i][0] = task;
            roundsData[i][1] = correctAnswer;
        }
        Engine.runGame(DESCRIPTION, roundsData);
    }

    private static int getOperationResult(String operationType, int val1, int val2) {
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
