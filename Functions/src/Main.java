public class Main {
    /**
     *  Функции
     *  Блок кода, имеющий имя, который можно вызывать в разных местах программы.
     *
     *  <тип результата> <название функции>([параметр 1], [параметр 2], ...) {
     *      <операторы>
     *      [return <значение>]
     *  }
     *
     *  Если функция не возвращает значений, то указывается тип void.
     *  Параметры функции передаются через запятую, перед каждым указывается тип.
     *  Параметры функций называются Аргументы.
     *
     *  Для чего использовать функции:
     *  1. Структурирование кода
     *     Ускоряет работу команды над проектом. Позволяет легко вносить изменения в код.
     *  2. Исключение дублируемости кода
     *     Уменьшение объёма кода
     */

    static void PrintSequence(int begin, int end) {
        for (int i = begin; i <= end; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    static int SumSequence(int begin, int end) {
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        PrintSequence(4, 12);
        System.out.printf("SUM = %d", SumSequence(4, 12));
    }
}