import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int scan, number;
        int answer = 0;
        Scanner input = new Scanner(System.in);
        scan = input.nextInt();
        number = scan;
        while (number != 1) {

            if (number % 2 == 0) {
                answer = 2;
            } else if (number % 3 == 0) {
                answer = 3;
            } else if (number % 5 == 0) {
                answer = 5;
            } else if (number % 7 == 0) {
                answer = 7;
            } else if (number % 9 == 0) {
                answer = 9;
            } else answer = number;
            number = 1;
        }
        System.out.println(answer);
    }
}