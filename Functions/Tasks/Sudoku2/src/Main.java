import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                SumSequence(n);
            }
            System.out.println("\r");
        }
    }
    static void SumSequence(int n) {
        int row, col;
        row = n;
        col = n;
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Scanner input = new Scanner(System.in);
                int n1 = input.nextInt();
                matrix[i][j]=n1;
                System.out.printf("%3d", matrix[i][j]);
            }
        }
        System.out.println();
    }

}
