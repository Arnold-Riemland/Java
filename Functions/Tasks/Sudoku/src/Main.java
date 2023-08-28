import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    SumSequence(n);
                }
                System.out.println("\r");
            }
            System.out.println("Correct");
        } else System.out.println("Incorrect");
    }

    static void SumSequence(int n) {
        int row, col;
        row = n;
        col = n;
        int[][] matrix = new int[row][col];
        Random rnd = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = rnd.nextInt(n * n) + 1;
                System.out.printf("%3d", matrix[i][j]);
            }
        }
        System.out.println();
    }

}
