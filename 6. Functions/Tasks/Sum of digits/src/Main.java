import java.util.Scanner;

public class Main {


    static int SumOfDigits(int n) {
        if (n < 10)
            return n;
        return n % 10 + SumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.printf("%d", SumOfDigits(num));
    }
}