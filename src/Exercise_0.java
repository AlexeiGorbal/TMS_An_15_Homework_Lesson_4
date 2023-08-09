import java.util.Arrays;
import java.util.Scanner;

public class Exercise_0 {
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
        System.out.print("Enter the number you want to check: ");
        int number = scanner.nextInt();
        int bs = Arrays.binarySearch(array, number);
        if (array[bs] == number) {
            System.out.println("This number is in the array");
        } else {
            System.out.println("This number is not in the array");
        }
    }
}
