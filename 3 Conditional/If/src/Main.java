import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Условные операторы
         * >  <  >=  <=  ==  !=
         *
         * Логические операции
         * && - И
         * || - ИЛИ
         * !  - НЕ
         *
         * Условная конструкция if
         * if (<условие>) {
         *     <операторы>
         * }
         * else {
         *     <операторы>
         * }
         *
         * else - может отсутствовать
         */
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Число чётное");
        }
        else {
            System.out.println("Число нечётное");
        }
    }
}