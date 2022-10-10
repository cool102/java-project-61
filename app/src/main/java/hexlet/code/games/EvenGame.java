package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenGame {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        final int bound = 20;
        String[][] roundsData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            String task = generateTask(bound);
            boolean randomIsEven = isRandomIsEven(task);
            String correctAnswer = randomIsEven ? "yes" : "no";
            roundsData[i][0] = task;
            roundsData[i][1] = correctAnswer;
        }
        Engine.runGame(DESCRIPTION, roundsData);
    }

    private static String generateTask(int bound) {
        return String.valueOf(new Random().nextInt(bound) + 1);
    }

    private static boolean isRandomIsEven(String task) {
        return Integer.parseInt(task) % 2 == 0;
    }

}
