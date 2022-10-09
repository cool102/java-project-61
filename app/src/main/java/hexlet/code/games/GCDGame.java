package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCDGame {
    private static String description = "Find the greatest common divisor of given numbers.";

    public static void run() {
        Random randomizer = new Random();
        final int valuesBound = 100;
        int val1;
        int val2;
        final int loops = 3;
        System.out.println(description);
        for (int i = 0; i < loops; i++) {
            val1 = randomizer.nextInt(valuesBound) + 1;
            val2 = randomizer.nextInt(valuesBound) + 1;
            String task = String.format("%s %s", val1, val2);
            String correctAnswer = String.valueOf(getGCD(val1, val2));
            Engine.runRound(task, correctAnswer);
        }
    }

    private static int getGCD(int x, int y) {
        int[] array = new int[1];
        if ((x > y) && (x % y == 0)) {
            return y;
        } else if ((y > x) & (y % x == 0)) {
            return x;
        } else if (x == y) {
            return x;
        } else if (x > y) {
            for (int i = 1; i < x; i++) {
                if (x % i == 0 && y % i == 0) {
                    array[0] = i;
                }
            }
            return array[0];
        } else {
            for (int i = 1; i < x; i++) {
                if (x % i == 0 && y % i == 0) {
                    array[0] = i;
                }
            }
            return array[0];
        }

    }
}
