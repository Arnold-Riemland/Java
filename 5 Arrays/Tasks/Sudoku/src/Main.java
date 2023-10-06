import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        n *= n;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        if (CheckSudoku(matrix)) {
            System.out.println("Correct");

        } else {
            System.out.println("Incorrect");
        }
    }

    public static boolean CheckColumn(int[][] matrix, int col) {
        return false;
    }

    public static boolean CheckRow(int[][] matrix, int row) {
        int[] array = new int[]{3, 4, 5, 1, 3, 6, 9, 8, 7};
            if (matrix[row].length != array.length) {
                return false;
            }
        return true;
    }
    public static boolean CheckBox(int[][] matrix, int col, int row) {


        return false;
    }

    public static boolean CheckSudoku(int[][] matrix) {
        // Проверка строк
        // Проверка столбцов
        // Проверка квадратов
        if (CheckRow(matrix, 3)) {
            return true;
        }

        return false;
    }
}

