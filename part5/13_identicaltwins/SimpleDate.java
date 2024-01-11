
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean equals(Object compared) {
        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        SimpleDate otherDate = (SimpleDate) compared;

        return this.day == otherDate.day
                && this.month == otherDate.month
                && this.year == otherDate.year;

    }

    @Override
    public String toString() {
        return String.format("%d.%d.%d", this.day, this.month, this.year);
    }
}
