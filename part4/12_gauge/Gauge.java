public class Gauge {
    private int value;

    public Gauge() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        if (!this.full()) {
            this.value++;
        }
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public boolean full() {
        return this.value == 5;
    }
}
