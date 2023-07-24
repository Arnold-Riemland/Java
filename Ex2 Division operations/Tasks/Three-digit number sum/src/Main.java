import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Пользователь вводит трёхзначное число.
         * Необходимо найти сумму его цифр.
         */
        int nummer, a, b, c;
        Scanner input = new Scanner(System.in);
        nummer = input.nextInt();
        a = nummer / 100;//3
        b = nummer % 100 / 10;//6
        c = nummer % 10;

        System.out.printf("Sum = %d", a + c + b);
    }
}