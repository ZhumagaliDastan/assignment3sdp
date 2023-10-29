public class LoggingObserver implements Observer {
    @Override
    public void update(double result) {
        System.out.println("Logging result: " + result);
    }
}
