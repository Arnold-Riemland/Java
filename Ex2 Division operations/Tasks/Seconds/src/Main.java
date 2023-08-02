import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int scan, a, b, c;
        System.out.println("Пожалуйста, введите секунды");
        Scanner input = new Scanner(System.in);
        scan = input.nextInt();
        a = scan / 3600;
        b = (scan % 3600) / 60;
        c = scan % 60;
        System.out.printf("%d:%d:%d", a, b, c);
    }
}