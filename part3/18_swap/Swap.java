
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        System.out.println("Give two indices to swap: ");
        int index1 = Integer.valueOf(scanner.nextLine());
        int index2 = Integer.valueOf(scanner.nextLine());
        scanner.close();

        array = swap(array, index1, index2);

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

    public static int[] swap(int[] arr, int index1, int index2) {
        if (index1 == index2) {
            return arr;
        }
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
        return arr;
    }

}
