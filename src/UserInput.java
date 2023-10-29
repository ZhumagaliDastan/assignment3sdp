import java.util.Scanner;

public class UserInput {
    private InputValidator validator;
    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
        validator = new InputValidator(scanner);
    }

    public String getOperation() {
        System.out.println("Enter an operation (+, -, *, /, ^, sqrt) or 'q' to quit:");
        return scanner.nextLine();
    }

    public double getValue() {
        return validator.getValidDouble();
    }
}
