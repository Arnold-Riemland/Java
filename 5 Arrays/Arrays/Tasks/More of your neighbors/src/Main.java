import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int array[] = new int[5];
        for (int j = 0; j < array.length; j++) {
            array[j] = input.nextInt();
        }
        for (int i = 1; i <= array.length; i++) {
            if (i + 2 < array.length) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    sum++;
                    System.out.printf("%d ", array[i]);
                }
            }
        }
        if (sum == 0) {
            System.out.println(sum);
        }
    }
}