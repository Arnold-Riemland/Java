import java.util.Scanner;

public class Main {

    static void Binary(int n) {
        if (n < 0) {
            System.out.print("-");
            Binary(-n);
        }
        if (n > 0) {
            Binary(n / 2);
            System.out.printf("%d", n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Binary(num);
    }
}