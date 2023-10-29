public abstract class CalculatorDecorator extends Calculator {
    protected Calculator calculator;

    public CalculatorDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void performOperation(String operation, double value) {
        calculator.performOperation(operation, value);
    }

    @Override
    public double getResult() {
        return calculator.getResult();
    }
}
