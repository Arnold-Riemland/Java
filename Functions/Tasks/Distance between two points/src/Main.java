import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        System.out.printf("Answer = %f", SumSequence(x1, y1, x2, y2));
    }
    static double SumSequence(int x1, int y1, int x2, int y2) {
        double sum;
        sum = sqrt(pow(x2,2)-pow(x1,2)+pow(y2,2)-pow(y1,2));
        return  sum;
    }
}

