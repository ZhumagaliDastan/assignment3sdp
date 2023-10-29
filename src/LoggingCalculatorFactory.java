public class LoggingCalculatorFactory implements CalculatorFactory {
    @Override
    public Calculator createCalculator() {
        return new LoggingCalculator(new Calculator());
    }
}
