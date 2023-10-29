import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private double currentValue;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        double result = getResult();
        for (Observer observer : observers) {
            observer.update(result);
        }
    }

    public Calculator() {
        this.currentValue = 0;
    }


    public void performOperation(String operation, double value) {
        switch (operation) {
            case "+":
                add(value);
                break;
            case "-":
                subtract(value);
                break;
            case "*":
                multiply(value);
                break;
            case "/":
                divide(value);
                break;
            case "^":
                currentValue = Math.pow(currentValue, value); // Exponentiation
                break;
            case "sqrt":
                if (currentValue >= 0) {
                    currentValue = Math.sqrt(currentValue); // Square root
                } else {
                    System.out.println("Error: Cannot calculate square root of a negative number");
                }
                break;
            default:
                handleInvalidOperation();
        }

        notifyObservers();
    }


    private void add(double value) {
        currentValue += value;
    }

    private void subtract(double value) {
        currentValue -= value;
    }

    private void multiply(double value) {
        currentValue *= value;
    }

    private void divide(double value) {
        if (value != 0) {
            currentValue /= value;
        } else {
            System.out.println("Error: Division by zero");
        }
    }

    private void power(double value) {
        currentValue = Math.pow(currentValue, value);
    }

    private void squareRoot() {
        if (currentValue >= 0) {
            currentValue = Math.sqrt(currentValue);
        } else {
            System.out.println("Error: Cannot calculate square root of a negative number");
        }
    }

    private void handleInvalidOperation() {
        System.out.println("Invalid operation");
    }

    public double getResult() {
        return currentValue;
    }
}
