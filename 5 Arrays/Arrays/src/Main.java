import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         *  Массивы
         *  Массив - это структура, хранящая элементы одного типа.
         *  К каждому элементу можно обращаться по индексу. Индексы начинаются с нуля.
         *
         *  <тип> <название>[] = new <тип>[<размер>];
         *
         *  Инициализация массивов при объявлении
         *  <тип> <название>[] = new <тип>[] {<значение 1>, ...};
         *  <тип> <название>[] = {<значение 1>, ...};
         *
         *  Получение длины массива
         *  У массивов есть свойство length, которое возвращает длинну массива.
         */

        int nums[] = {5, 8, 2, 12, 20};

        // Способ с индексацией
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d ", nums[i]);
        }

        System.out.println();

        // Способ перебора
        // (используется, когда нет необходимости обращаться к другим элементам массива внутри одной итерации)
        for (int num : nums) {
            System.out.printf("%d ", num);
        }
    }
}