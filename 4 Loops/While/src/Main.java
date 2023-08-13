import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {

        /**
         *  Цикл while
         *
         *  (с предусловием)
         *  while (<условие>) {
         *      <операторы>
         *  }
         *
         *  (с постусловием)
         *  do {
         *      <операторы>
         *  } while(<условие>);
         *
         *  Разница в том, что в цикле с постусловием тело цикла выполнится хотя бы один раз.
         *
         *  Важно, чтобы внутри цикла изменялась какая-либо переменная из условия.
         *  Иначе есть вероятность, что цикл может не закончиться.
         *  Цикл while чаще используется, если заранее неизвестно кол-во итераций цикла.
         *
         *  Операторы, нарущающие естественное поведение цикла:
         *  break    - заканчивает цикл, в котором находится
         *  continue - пропускает операторы, стоящие за ним внутри цикла. Цикл переходит к следующей итерации.
         */
        int num;
        int max;
        int a = 1;
        int location = 1;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        max = num;
        while (num != 0) {
            num = input.nextInt();
            a++;
            if (num > max) {
                location = a;
            }
            max = Math.max(num, max);
        }
        System.out.println(max);
        System.out.println(location);
    }
}