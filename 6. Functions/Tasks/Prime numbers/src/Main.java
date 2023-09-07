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
            if (isPrim(number)) {
                count++;
                System.out.printf("%d ", number);
            }
        }
    }

    public static boolean isPrim(int number) {
        int ansver = 2;
        // TODO: Проверить и исправить!!!!
        while (number % ansver != 0) {
            ansver++;
        }
        return number == ansver;
    }
}