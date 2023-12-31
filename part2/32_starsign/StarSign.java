
public class StarSign {

    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        while (number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        while (height > 0) {
            printStars(width);
            height--;
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
