
public class Statistics {
    private int counter;

    public Statistics() {
        this.counter = 0;
    }

    public void addNumber(int number) {
        counter++;
    }

    public int getCount() {
        return this.counter;
    }
}
