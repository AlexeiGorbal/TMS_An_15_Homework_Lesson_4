import java.util.Scanner;

public class Exercise_1 {
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
        System.out.print("Enter the number you want to delete: ");
        int number = scanner.nextInt();
        boolean bool = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                for (; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                bool = true;
                break;
            }
        }
        if (bool) {
            System.out.print("Resulting array: [ ");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("]");
        } else {
            System.out.println("There is no such number in the array");
        }
    }
}
