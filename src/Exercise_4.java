import java.util.Arrays;
import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array from five to ten: ");
        boolean bool = true;
        int len = 0;
        while (bool) {
            len = scanner.nextInt();
            if (len >= 5 && len <= 10) {
                bool = false;
            } else {
                System.out.println("You entered the wrong number");
                System.out.print("Try again: ");
            }
        }
        double[] arrayOne = new double[len];
        System.out.println("Fill the array");
        for (int i = 0; i < arrayOne.length; i++) {
            double number = scanner.nextDouble();
            arrayOne[i] = number;
        }
        int lenTwo = 0;
        for (double v : arrayOne) {
            if (v % 2 == 0) {
                lenTwo++;
            }
        }
        int i = 0;
        double[] arrayTwo = new double[lenTwo];
        for (double v : arrayOne) {
            if (v % 2 == 0) {
                arrayTwo[i] = v;
                i++;
            }
        }
        System.out.println("Initial array: " + Arrays.toString(arrayOne));
        System.out.println("Array with even numbers: " + Arrays.toString(arrayTwo));
    }
}

