package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class CalcGame {
    private static String description = "What is the result of the expression?";

    public static void run() {
        Random randomizer = new Random();
        String[] operations = {"+", "-", "*"};
        final int valuesBound = 10;
        int operationsBound = operations.length;
        int val1;
        int val2;
        String operationType;
        final int loops = 3;

        System.out.println(description);
        for (int i = 0; i < loops; i++) {
            val1 = randomizer.nextInt(valuesBound) + 1;
            val2 = randomizer.nextInt(valuesBound) + 1;
            operationType = operations[randomizer.nextInt(operationsBound)];
            String task = String.format("%s %s %s", val1, operationType, val2);
            String correctAnswer = String.valueOf(getOperationResult(operationType, val1, val2));
            Engine.runRound(task, correctAnswer);
        }
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
