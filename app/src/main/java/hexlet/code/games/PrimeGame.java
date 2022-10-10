package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class PrimeGame {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        final int bound = 30;
        String[][] roundsData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int random = new Random().nextInt(bound) + 1;
            String task = String.valueOf(random);
            boolean isPrime = isPrime(random);
            String correctAnswer = isPrime ? "yes" : "no";
            roundsData[i][0] = task;
            roundsData[i][1] = correctAnswer;
        }
        Engine.runGame(DESCRIPTION, roundsData);
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
