import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Tossing aa coin...");

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 1; i <= 3; i++) {
            String result = random.nextBoolean() ? "Heads" : "Tails";
            System.out.println("Round " + i + ": " + result);
            if (result.equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);

        // check result
        if (headsCount > tailsCount) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}
