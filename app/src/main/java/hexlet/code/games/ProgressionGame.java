package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static String skippedElement;
    private static int skippedIndex;

    public static void run() {
        final int loops = 3;
        String[][] roundsData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < loops; i++) {
            String[] generatedProgression = generateProgression();
            String correctAnswer = getCorrectAnswer(generatedProgression);
            String task = getTask(generatedProgression, skippedIndex);
            roundsData[i][0] = task;
            roundsData[i][1] = correctAnswer;
        }
        Engine.runGame(DESCRIPTION, roundsData);
    }

    private static String[] generateProgression() {
        Random randomizer = new Random();
        final int progressionArrayLength = 10;
        String[] progressionArray = new String[progressionArrayLength];
        final int firstElementBound = 20;
        final int stepBound = 5;
        int firstElem = randomizer.nextInt(firstElementBound) + 1;
        int step = randomizer.nextInt(stepBound) + 1;
        progressionArray[0] = String.valueOf(firstElem);
        for (int i = 0; i < progressionArray.length - 1; i++) {
            int nextElement = Integer.parseInt(progressionArray[i]) + step;
            progressionArray[i + 1] = String.valueOf(nextElement);
        }
        return progressionArray;
    }

    private static String getTask(String[] progressionArray, int skipIndex) {
        Random randomizer = new Random();
        progressionArray[skipIndex] = "..";
        return String.join(" ", progressionArray);

    }

    private static String getCorrectAnswer(String[] arr) {
        Random randomizer = new Random();
        skippedIndex = randomizer.nextInt(arr.length);
        return arr[skippedIndex];
    }

}
