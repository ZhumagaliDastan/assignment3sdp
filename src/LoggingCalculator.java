public class LoggingCalculator extends CalculatorDecorator {
    public LoggingCalculator(Calculator calculator) {
        super(calculator);
    }
}
