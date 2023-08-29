import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int amountOfElements;
        int count = 0;
        int number = 1;
        Scanner input = new Scanner(System.in);
        amountOfElements = input.nextInt();
        while (amountOfElements != count) {
            if (isSimple(number)) {
                count++;
                System.out.printf("%d ", number);
                number++;
            } else number++;
        }
    }

    public static boolean isSimple(int number) {
        int ansver = 1;
        int sum = 0;
        while (number > ansver) {
            if (number % ansver != 0) {
            } else if (number != ansver) {
                sum += ansver;
            }
            ansver++;
        }
        if (sum == number) {
            return true;
        }
        return false;
    }
}