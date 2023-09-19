import java.util.Scanner;

public class Main {
    static long Factorial(int n) {
        if (n > 0)
            return Factorial(n - 1) * n;
        return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.printf("%d! = %d", num, Factorial(num));
    }
}