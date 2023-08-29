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
            isSimple(number);
            if (isSimple(number) == true) {
                count++;
                System.out.printf("%d ", number);
            }
        }
    }

    public static boolean isSimple(int number) {
        int ansver = 2;
        while (number % ansver != 0) {
            ansver++;
        }
        if (number == ansver) {
            return true;
        } else return false;
    }
}