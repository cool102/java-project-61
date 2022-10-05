package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {
    private static String skippedElement;
    private static String description = "What number is missing in the progression?";

    public static void run() {
        final int loops = 3;
        System.out.println(description);
        for (int i = 0; i < loops; i++) {
            String task = generateProgression();
            Engine.setTask(task);
            Engine.setGameAnswer(skippedElement);
            Engine.makeDecision();
        }
    }

    private static String generateProgression() {
        Random randomizer = new Random();
        final int progressionArrayLength = 10;
        String[] progressionArray = new String[progressionArrayLength];
        final int firstElementBound = 20;
        final int stepBound = 5;
        int skippedIndex;
        int firstElem = randomizer.nextInt(firstElementBound) + 1;
        int step = randomizer.nextInt(stepBound) + 1;
        progressionArray[0] = String.valueOf(firstElem);
        for (int i = 0; i < progressionArray.length - 1; i++) {
            int nextElement = Integer.parseInt(progressionArray[i]) + step;
            progressionArray[i + 1] = String.valueOf(nextElement);
        }
        skippedIndex = randomizer.nextInt(progressionArray.length);
        skippedElement = progressionArray[skippedIndex];
        progressionArray[skippedIndex] = "..";
        return String.join(" ", progressionArray);

    }

}
