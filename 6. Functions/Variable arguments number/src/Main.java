public class Main {
    /**
     * Переменное число параметров
     * Если предполагается, что число параметров может быть различно, то можно использовать следующий подход.
     * Однако есть ограничения:
     * 1. Тип параметров должен быть один и тот же
     * 2. Если присутствуют и другие аргументы, то множественные должны стоять в конце.
     *    Пример: f(int a, double ...b);
     */
    public static double Average(int ...nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        return (double) sum / nums.length;
    }
    public static void main(String[] args) {
        System.out.println(Average(1, 2, 3, 4, 5, 25, 46));
    }
}