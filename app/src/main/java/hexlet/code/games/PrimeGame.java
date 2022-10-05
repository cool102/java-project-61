package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class PrimeGame {

    private static String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        final int bound = 30;
        System.out.println(description);
        final int loops = 3;
        for (int i = 0; i < loops; i++) {
            int random = new Random().nextInt(bound) + 1;
            String task = String.valueOf(random);
            Engine.setTask(task);
            boolean isPrime = isPrime(random);
            String correctAnswer = isPrime ? "yes" : "no";
            Engine.setGameAnswer(correctAnswer);
            Engine.makeDecision();
        }

    }

    private static boolean isPrime(int candidate) {
        if (candidate == 1) {
            return false;
        }
        int divsorsCount = 0;
        for (int i = 1; i <= candidate; i++) {
            if (candidate % i == 0) {
                divsorsCount++;
            }
        }
        return divsorsCount == 2;
    }
}
