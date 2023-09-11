import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    /**
     * Перегрузка функций
     * Явление, когда функция называется одинаково, делает логически одно и то же действие, но различается по параметрам.
     * Компилятор сам выбирает какую версию функции использовать, в зависимости от переданных параметров.
     *
     * TODO: Написать функции для определения площади треугольника (Разные способы).
     */

    /**
     * Расстояние между точками в двухмерном пространстве.
     */
    static double Distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    /**
     * Расстояние между точками в трёхмерном пространстве.
     */
    static double Distance(int x1, int y1, int z1, int x2, int y2, int z2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2) + pow(z2 - z1, 2));
    }

    public static void main(String[] args) {
        System.out.println(Distance(1, 1, 2, 2));
        System.out.println(Distance(1, 1, 1, 2, 2, 2));
    }
}