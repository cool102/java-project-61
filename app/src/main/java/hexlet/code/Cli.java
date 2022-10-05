package hexlet.code;

import java.util.Scanner;

class Cli {
    private static Scanner sc = new Scanner(System.in);

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        Engine.setGamerName(name);
        System.out.print("Hello, " + name + "!\n");
    }
}
