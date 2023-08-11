import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        float a, b, c, c1, c2, h;
        System.out.println("укажите сторону а");
        Scanner input1 = new Scanner(System.in);
        a = input1.nextFloat();
        System.out.println("укажите сторону b");
        b = input1.nextFloat();
        System.out.println("укажите сторону c");
        c = input1.nextFloat();
        if (a < b + c && b < a + c && c < a + b && a > 0 && b > 0 && c > 0) {
            h = max(max(a, b), c);
            c1 = min(min(a, b), c);
            c2 = (a + b + c) - (h + c1);
            if (pow(c1, 2) + pow(c2, 2) == pow(h, 2)) {
                System.out.printf("прямоугольный треугольник %f", c);
            } else if (pow(c1, 2) + pow(c2, 2) < pow(h, 2)) {
                System.out.printf("тупоугольный треугольник %f", c);
            } else if (pow(c1, 2) + (pow(c2, 2)) > pow(h, 2)) {
                System.out.printf("остроугольный треугольник %f", c);
            }
        } else System.out.println("такого треугольника не существует");
    }
}