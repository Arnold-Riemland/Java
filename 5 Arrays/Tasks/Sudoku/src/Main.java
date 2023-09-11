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

    public static boolean CheckSudoku(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int b=0;
            for (int j = 0; j < matrix[i].length; j++) {
                b++;
                int k = b;
                if (k < matrix.length ) {
                    for (int d = 0; d < matrix.length; d++) {
                        if (k < matrix.length ) {
                            if (matrix[i][j] == matrix[i][k]) {
                                return false;
                            } else k++;
                        }
                    }
                }
            }
        }
        return true;
        }
    }

