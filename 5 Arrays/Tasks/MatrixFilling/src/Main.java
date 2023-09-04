import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        int action, rowsCount, colsCount;
        int[][] matrix = null;
        System.out.print("Выберите вариант заполнения (1-4): ");
        Scanner input = new Scanner(System.in);
        action = input.nextInt();
        System.out.println("Установить размеры матрицы");
        switch (action) {
            case 1:
                System.out.print("Строк: ");
                rowsCount = input.nextInt();
                System.out.println("Столбцов: ");
                colsCount = input.nextInt();
                matrix = new int[rowsCount][colsCount];
                one(matrix);
                break;
            case 2:
                System.out.println("Размер: ");
                rowsCount = input.nextInt();
                colsCount = rowsCount;
                matrix = new int[rowsCount][colsCount];
                two(matrix);
                break;
            case 3:
                System.out.println("Размер: ");
                rowsCount = input.nextInt();
                colsCount = rowsCount;
                matrix = new int[rowsCount][colsCount];
                three(matrix);
                break;
            case 4:
                System.out.print("Строк: ");
                rowsCount = input.nextInt();
                System.out.println("Столбцов: ");
                colsCount = input.nextInt();
                matrix = new int[rowsCount][colsCount];
                four(matrix);
                break;
            default:
                System.out.println("Неверный выбор!");
        }
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%5d", num);
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }

    public static void one(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + j) % 2;
            }
        }
    }

    public static void two(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i == j || i + j == matrix[i].length - 1) ? 1 : 0;
            }
        }
    }

    public static void three(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i + j == matrix[i].length - 1) {
                    matrix[i][j] = 0;
                } else if (i < j && i + j < matrix[i].length - 1) {
                    matrix[i][j] = 1;
                } else if (i < j && i + j > matrix[i].length - 1) {
                    matrix[i][j] = 2;
                } else if (i > j && i + j > matrix[i].length - 1) {
                    matrix[i][j] = 3;
                } else if (i > j && i + j < matrix[i].length - 1) {
                    matrix[i][j] = 4;
                }
            }
        }
    }

    public static void four(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = min(min(i, j), min(matrix.length - i - 1, matrix[i].length - j - 1));
            }
        }
    }
}