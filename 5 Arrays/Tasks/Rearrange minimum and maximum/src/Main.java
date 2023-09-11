import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        int mi = 1000;
        int a = 0;
        int b = 0;
        int ma = 0;
        int c = 0;
        int d = 0;
        int x;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int[] array = new int[number];
        if (number != sum) {
            for (int i = 0; i < number; i++) {
                array[i] = input.nextInt();
                sum++;
            }
        }
        for (int i = 0; i < array.length; i++) {

            ma = max(array[i], ma);
            if (ma > c) {
                a=i;
            }
            c = ma;
        }
        for (int i = 0; i < array.length; i++) {
            mi = min(array[i], mi);
            if (d > mi) {
                b=i;
            }
            d = mi;
        }
        x=array[a];
        array[a] = array[b];
        array[b] = x;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}