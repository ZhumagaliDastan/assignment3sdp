import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CalculatorFactory factory = new LoggingCalculatorFactory();
        Calculator calculator = factory.createCalculator();
        Output output = new Output();
        UserInput userInput = new UserInput();

        Observer loggingObserver = new LoggingObserver();
        Observer displayObserver = new DisplayObserver();
        calculator.addObserver(loggingObserver);
        calculator.addObserver(displayObserver);

        while (true) {
            String operation = userInput.getOperation();

            if (operation.equals("q")) {
                break;
            }

            double value = userInput.getValue();
            calculator.performOperation(operation, value);

            double result = calculator.getResult();
            output.showResult(result);
        }
    }
}
