import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        int number;
        int tmp, maxPos = 0, minPos = 0;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = input.nextInt();
            if (array[i] > array[maxPos]) {
                maxPos = i;
            }
            if (array[i] < array[minPos]) {
                minPos = i;
            }
        }
        tmp = array[maxPos];
        array[maxPos] = array[minPos];
        array[minPos] = tmp;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}