package hexlet.code;

public class App {
    public static void main(String[] args) {
        String choice = Cli.greeting();
        Engine.start(choice);
    }
}
