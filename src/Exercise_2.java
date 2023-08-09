import java.util.Arrays;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int len = scanner.nextInt();
        double[] array = new double[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        System.out.println(Arrays.toString(array));
        double max = array[0], min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i + 1]) {
                max = array[i + 1];
            }
            if (min > array[i + 1]) {
                min = array[i + 1];
            }
        }
        double average = (max + min) / 2;
        System.out.println("Minimum value: " + min + "\nMaximum value: " + max + "\nAverage value: " + average);
    }
}
