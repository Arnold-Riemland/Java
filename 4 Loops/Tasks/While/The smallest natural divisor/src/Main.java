import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int answer = 2;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        while (number % answer != 0) {
            answer++;
        }
        System.out.println(answer);
    }
}