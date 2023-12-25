public class Cube {
    private int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public int volume() {
        return this.length * this.length * this.length;
    }

    public String toString() {
        String text = "The length of the edge is %d and the volume %d";
        return String.format(text, this.length, this.volume());
    }
}
