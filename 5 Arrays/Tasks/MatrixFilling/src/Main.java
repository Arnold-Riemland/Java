import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int eingabe;
        System.out.println("Menu ");
        System.out.println("1)1010\n2)100001\n3)0111111110\n4)000000000 \n  011111110");
        Scanner input1 = new Scanner(System.in);
        eingabe = input1.nextInt();
        switch (eingabe) {
            case 1:
                System.out.println("Установить длину строки и столбца \n");
                System.out.println("строка");
                int n1 = input1.nextInt();
                System.out.println("столбец");
                int n2 = input1.nextInt();
                one(n1, n2);
                break;
            case 2:
                System.out.println("Установить длину строки и столбца \n");
                System.out.println("длина столбца");
                int n3 = input1.nextInt();
                System.out.println("длина строки");
                int n4 = input1.nextInt();
                two(n3, n4);
                break;
            case 3:
                System.out.println("Установить длину строки и столбца \n");
                System.out.println("длина столбца");
                int n5 = input1.nextInt();
                System.out.println("длина строки");
                int n6 = input1.nextInt();
                three(n5, n6);
                break;
            case 4:
                System.out.println("Установить длину строки и столбца \n");
                System.out.println("длина столбца");
                int n7 = input1.nextInt();
                System.out.println("длина строки");
                int n8 = input1.nextInt();
                four(n7, n8);
                break;
        }
    }

    public static void one(int n1, int n2) {
        int sum = 0;
        int[][] matrix = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                sum++;
                if (sum % 2 != 0) {
                    matrix[i][j] = 1;
                    System.out.printf("%4d ", matrix[i][j]);
                } else {
                    matrix[i][j] = 0;
                    System.out.printf("%4d ", matrix[i][j]);
                }
            }
            System.out.println("\n");
            sum++;
        }
        System.out.println("\n");

    }

    public static void two(int n1, int n2) {
        int[][] matrix = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (i == j || i + j == n2 - 1) {
                    matrix[i][j] = 1;
                    System.out.printf("%4d ", matrix[i][j]);
                } else {
                    matrix[i][j] = 0;
                    System.out.printf("%4d ", matrix[i][j]);
                }
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }

    public static void three(int n1, int n2) {
        int oben;
        int links;
        int unten;
        int rechts;
        int[][] matrix = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                oben = (n2 / 2) - 2;
                links = (n2 / 2) - 2;
                unten = (n2 / 2);
                rechts = (n2 / 2);
                if (i == j || i + j == n2 - 1) {
                    matrix[i][j] = 0;
                    System.out.printf("%4d ", matrix[i][j]);
                } else if (i == 0 || i <= oben && j > i && i + j < n1) {
                    matrix[i][j] = 1;
                    System.out.printf("%4d ", matrix[i][j]);

                } else if (j == n1 - 1 || j > rechts && i + j >= n1 && i < j) {
                    matrix[i][j] = 2;
                    System.out.printf("%4d ", matrix[i][j]);
                } else if (j == 0 || j <= links && i + j < n1) {
                    matrix[i][j] = 3;
                    System.out.printf("%4d ", matrix[i][j]);
                } else if (i >= unten || j < i && i + j > n1) {
                    matrix[i][j] = 4;
                    System.out.printf("%4d ", matrix[i][j]);
                }
            }
            System.out.println("\n");
        }
    }
    public static void four(int n1, int n2) {
        int[][] matrix = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (i==0||j==n2-1||j==0||i==n1-1) {
                    matrix[i][j] = 0;
                    System.out.printf("%4d ", matrix[i][j]);
                } else if(i==1||j==n2-2||i==n1-2||j==1){
                    matrix[i][j] = 1;
                    System.out.printf("%4d ", matrix[i][j]);
                }else {matrix[i][j] = 2;
                System.out.printf("%4d ", matrix[i][j]);}
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}