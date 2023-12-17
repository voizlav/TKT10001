
public class Statistics {
    private int counter;
    private int sum;

    public Statistics() {
        this.counter = 0;
    }

    public void addNumber(int number) {
        counter++;
        sum += number;
    }

    public int getCount() {
        return this.counter;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.sum == 0) {
            return (double) this.sum;
        }

        return (double) this.sum / this.counter;
    }
}
