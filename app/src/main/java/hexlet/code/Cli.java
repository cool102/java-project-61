package hexlet.code;

import java.util.Scanner;

class Cli {


    public static String greeting() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        System.out.println("Your choice: " + choice);
        return choice;
    }
}