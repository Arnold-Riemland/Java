import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        int amountOfElements;
        int count = 0;
        int number = 1;
        Scanner input = new Scanner(System.in);
        amountOfElements = input.nextInt();
        while (amountOfElements != count) {
            if (isPrime(number)) {
                count++;
                System.out.printf("%d \n", number);
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < sqrt(number) + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}