import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to Helpful Tools!");

        System.out.println("1. English to Morse Code");
        System.out.println("2. Password Generator");
        System.out.println("3. Expenses Report");
        System.out.println();

        System.out.print("Please select an option: ");
        int choiceMenu = Integer.parseInt(scanner.nextLine());
        switch (choiceMenu) {
            case 1:
                System.out.print("Please enter what you want to translate to Morse Code: ");
                EnglishToMorseCode obj = new EnglishToMorseCode();
                obj.logic();
                break;
            case 2:
                PasswordGenerator.rndPass();
                break;
            case 3:
                Expenses expenses = new Expenses();
                expenses.expenses();
                break;
        }
    }
}
