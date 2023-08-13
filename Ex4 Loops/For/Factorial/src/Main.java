import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int scan;
        int sum = 1;
        Scanner input = new Scanner(System.in);
        scan = input.nextInt();
        for (int i = 1; i <= scan; i++) {
            sum = i * sum;
        }
        System.out.printf("%d", sum);

    }
}