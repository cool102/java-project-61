package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenGame {
    private static String description = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void run() {
        final int bound = 20;
        System.out.println(description);
        final int loops = 3;
        for (int i = 0; i < loops; i++) {
            String task = String.valueOf(new Random().nextInt(bound) + 1);
            Engine.setTask(task);
            boolean randomIsEven = (Integer.parseInt(task) % 2 == 0);
            String correctAnswer = randomIsEven ? "yes" : "no";
            Engine.setGameAnswer(correctAnswer);
            Engine.makeDecision();
        }

    }

}
