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
            }
            number++;
        }
    }

    public static boolean isSimple(int number) {
        if (number == 1)
            return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}