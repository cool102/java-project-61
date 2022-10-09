package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenGame {
    private static String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        final int bound = 20;
        System.out.println(description);
        final int loops = 3;
        for (int i = 0; i < loops; i++) {
            String task = generateTask(bound);
            boolean randomIsEven = isRandomIsEven(task);
            String correctAnswer = randomIsEven ? "yes" : "no";
            Engine.runRound(task, correctAnswer);
        }
    }

    private static String generateTask(int bound) {
        return String.valueOf(new Random().nextInt(bound) + 1);
    }

    private static boolean isRandomIsEven(String task) {
        return Integer.parseInt(task) % 2 == 0;
    }

}
