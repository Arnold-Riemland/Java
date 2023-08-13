import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        int f = 1;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            f = i * f;
        }
        System.out.printf("%d! = %d", num, f);

    }
}