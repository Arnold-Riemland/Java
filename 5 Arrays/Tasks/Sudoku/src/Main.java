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
        int array[] = new int[9];
        for(int i=row;i < row+1;){
            for(int j=0;j<matrix.length;j++){

}
            return true;
        }
        return false;
    }

    public static boolean CheckBox(int[][] matrix, int col, int row) {

        for (int i = 0; i < matrix.length; i++) {
            int b = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                b++;
                int k = b;
                if (k < matrix.length) {
                    for (int d = 0; d < matrix.length; d++) {
                        if (k < matrix.length) {
                            if (matrix[i][j] == matrix[i][k]) {
                                return false;
                            } else k++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean CheckSudoku(int[][] matrix) {
        // Проверка строк
        // Проверка столбцов
        // Проверка квадратов
        if(CheckRow(matrix,3)){
            return true;
        }

        return false;
    }
}

