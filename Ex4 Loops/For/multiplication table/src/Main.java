import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int scan, answer;
        Scanner input = new Scanner(System.in);
        scan = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            answer = i * scan;
            System.out.printf("%d * %d = %d \n", i, scan, answer);
        }
    }
}