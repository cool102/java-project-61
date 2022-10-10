package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String choice = SC.nextLine();
        run(choice);
    }

    public static void run(String choice) {

        switch (choice) {
            case "0":
                System.exit(0);
            case "1":
                Cli.greeting();
                break;
            case "2":
                EvenGame.run();
                break;
            case "3":
                CalcGame.run();
                break;
            case "4":
                GCDGame.run();
                break;
            case "5":
                ProgressionGame.run();
                break;
            case "6":
                PrimeGame.run();
                break;
            default:
                throw new RuntimeException("Вы выбрали несуществующее меню");
        }
    }
}
