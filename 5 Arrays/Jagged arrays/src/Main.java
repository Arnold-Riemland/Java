import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /**
         *  Зубчатые массивы
         *  Массив, у которого различается размер строк.
         *  1 2 5 4 7
         *  4 5 7
         *  1 2
         *  5 8 7 5
         */
        int row = 9;
        Random rnd = new Random();
        // Выделение памяти для зубчатого массива
        int[][] arr = new int[row][];
        for (int i = 0; i < row; i++) {
            arr[i] = new int[rnd.nextInt(10) + 1];
        }
        // --------------------------------------
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }

    }
}