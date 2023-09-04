import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int amountOfElements;
        int count = 0;
        int number = 1;
        Scanner input = new Scanner(System.in);
        amountOfElements = input.nextInt();
        while (amountOfElements != count) {
            number++;
            if (isPerfect(number)) {
                count++;
                System.out.printf("%d ", number);
            }
        }
    }

    public static boolean isPerfect(int number) {
        int ansver = 2;
        // TODO: Проверить и исправить!!!!
        while (number % ansver != 0) {
            ansver++;
        }
        return number == ansver;
    }
}