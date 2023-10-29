import java.util.Scanner;

public class InputValidator {
    private Scanner scanner;

    public InputValidator(Scanner scanner) {
        this.scanner = scanner;
    }

    public double getValidDouble() {
        double value = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter a value:");
                value = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric value.");
            }
        }

        return value;
    }

    public void closeScanner() {
        scanner.close();
    }
}
