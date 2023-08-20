import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int row, col;
        row = 10;
        col = 8;
        /**
         *  При обращении к матрице, указывается:
         *  a[<номер строки>][<номер столбца>]
         */
        // Выделение памяти для двумерного массива
        int[][] matrix = new int[row][col];
        // Random - класс для генерации случайных чисел
        Random rnd = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Генерация целого числа в диапазоне от min до max
                // nextInt(max - min) + min
                matrix[i][j] = rnd.nextInt(10 - (-10)) + (-10);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

    }
}