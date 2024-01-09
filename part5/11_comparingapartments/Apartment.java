import java.lang.Math;

public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return this.squares;
    }

    public int getPricePerSquare() {
        return this.princePerSquare;
    }

    public int getTotalPrice() {
        return this.princePerSquare * this.squares;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.getSquares();
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(this.getTotalPrice() - compared.getTotalPrice());
    }
}
