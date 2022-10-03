package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class Engine {
    private static final int GAME_STOP_ANSWERS = 3;
    private static String gamerName = "";
    private static int rightAnswers = 0;

    public static void start(String choice) {
        gamerName = askName();
        printQuestion(choice);
        do {
            rightAnswers = rightAnswers + play(choice, gamerName);
        } while (rightAnswers != GAME_STOP_ANSWERS);
        System.out.printf("Congratulations, %s!\n", gamerName);
    }

    public static int play(String choice, String name) {
        switch (choice) {
            case "2":
                return EvenGame.play(name);
            case "3":
                return CalcGame.play(name);
            case "4":
                return GCDGame.play(name);
            case "5":
                return ProgressionGame.play(name);
            case "6":
                return PrimeGame.play(name);
            default:
                throw new RuntimeException("Вы выбрали несуществующее меню");
        }
    }

    public static void printQuestion(String gameNumber) {
        switch (gameNumber) {
            case "0":
            case "1":
                System.exit(0);
            case "2":
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case "3":
                System.out.println("What is the result of the expression?");
                break;
            case "4":
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            case "5":
                System.out.println("What number is missing in the progression?");
                break;
            case "6":
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
            default:
                throw new RuntimeException("Выбран несуществующий номер игры");
        }
    }

    public static String askName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Hello, " + name + "!");
        return name;
    }


}
