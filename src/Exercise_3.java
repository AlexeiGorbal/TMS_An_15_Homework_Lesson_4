import java.util.Arrays;
import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arrayOne = new double[5];
        System.out.print("Enter array: ");
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            double num = scanner.nextDouble();
            arrayOne[i] = num;
        }
        double[] arrayTwo = new double[5];
        System.out.print("Enter array: ");
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            double num = scanner.nextDouble();
            arrayTwo[i] = num;
        }
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        double sumOne = 0;
        double sumTwo = 0;
        for (double v : arrayOne) {
            sumOne += v;
        }
        for (double j : arrayTwo) {
            sumTwo += j;
        }
        double averageOne = sumOne / 5;
        double averageTwo = sumTwo / 5;
        System.out.println("Average value of the first array: " + averageOne);
        System.out.println("Average value of the second array: " + averageTwo);
        if (averageOne > averageTwo) {
            System.out.println("The average value of the first array is greater then second");
        } else if (averageTwo > averageOne) {
            System.out.println("The average value of the second array is greater then first");
        } else {
            System.out.println("The average are");
        }
    }
}
