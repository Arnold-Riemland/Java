public class Main {
    static long Factorial(int n) {
        if (n > 0)
            return Factorial(n - 1) * n;
        return 1;
    }

    public static void main(String[] args) {
        System.out.printf("5! = %d", Factorial(5));
    }
}