import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        n *= n;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        if (CheckSudoku(matrix) == true) {
            System.out.println("Correct");

        } else System.out.println("Incorrect");

    }

    public static boolean CheckSudoku(int[][] matrix) {
        if (matrix == matrix) {
            return true;
        } else return false;
    }
}
