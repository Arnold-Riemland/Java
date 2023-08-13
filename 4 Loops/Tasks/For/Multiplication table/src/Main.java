import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int scan;
        Scanner input = new Scanner(System.in);
        scan = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", i, scan, i * scan);
        }
    }
}