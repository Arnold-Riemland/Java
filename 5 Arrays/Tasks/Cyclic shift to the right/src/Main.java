import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int tmp;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = input.nextInt();
        }

        tmp = array[number - 1];
        for (int i = number - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = tmp;

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}