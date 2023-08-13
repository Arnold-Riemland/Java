import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int scan;
        int sum;
        int a = 0;
        int b = 1;

        Scanner input = new Scanner(System.in);
        scan = input.nextInt();
        for (int i = 1; i <= scan; i++) {

            sum = a + b;
            a = b;
            b = sum;

            System.out.println(sum);
        }
    }
}