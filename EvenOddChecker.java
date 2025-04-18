import java.util.Scanner;

public class EvenOddChecker {

    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter an integer: ");
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        return number;
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    public static void main(String[] args) {
        int userInput = getIntegerInput();
        String resultMessage = checkEvenOrOdd(userInput);
        System.out.println(resultMessage);
    }
}
