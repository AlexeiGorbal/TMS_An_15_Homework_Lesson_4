import java.util.Arrays;
import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            int num = scanner.nextInt();
            array[i] = num;
        }
        System.out.println("Source array: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int arr = array[i];
            while (arr > 0) {
                int pr = arr % 10;
                if (pr % 2 > 0) {
                    array[i] = 0;
                    break;
                }
                arr /= 10;
            }
        }
        System.out.println("Resulting array: " + Arrays.toString(array));
    }
}

