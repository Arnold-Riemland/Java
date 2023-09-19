public class Main {

    static void Binary(int n) {

        if (n < 0) {
            if (n > -2) {
                System.out.print("-");
            }
            if (n % 2 == -1) {
                Binary(n / 2);
                System.out.printf("%d ", 1);
            } else {
                Binary(n / 2);
                System.out.printf("%d ", 0);
            }
        } else if (n > 0) {
            if (n % 2 == 1) {
                Binary(n / 2);
                System.out.printf("%d ", 1);
            } else {
                Binary(n / 2);
                System.out.printf("%d ", 0);
            }
        }
    }


    public static void main(String[] args) {
        Binary(5);

    }
}