public class DisplayObserver implements Observer {
    @Override
    public void update(double result) {
        System.out.println("Displaying result: " + result);
    }
}
