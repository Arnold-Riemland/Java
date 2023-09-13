import static java.lang.Math.*;

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
    static double AreaOfTriangle(int a, int h){
        return 0.5*a*h;
    }
    static double AreaOfTriangle(int a, int b,int sinus1){
        return 0.5*a*b*sin(Math.toRadians(sinus1));
    }

    static double AreaOfTriangle(int a, int b, int c, int R){
        return (a*b*c)/(4*R);
    }
    static double InscribedCircleAndSides(int a, int b, int c, int r){

        return ((a+b+c)/2)*r;
    }
    static double Distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }
    static double SideAndTwoAdjacentAngles(int a, int sinA, int sinB){
        return (a*a)*(sin(Math.toRadians(sinA))*sin(Math.toRadians(sinB)))/2/(sin(Math.toRadians(sinA))+sin(Math.toRadians(sinB)));
    }
    static double HeronsFormula(int a, int b , int c){
        double p;
        p=(a+b+c)/2;
        return sqrt(p*(p-a)*(p-b)*(p-c));
    }
    /**
     * Расстояние между точками в трёхмерном пространстве.
     */
    static double Distance(int x1, int y1, int z1, int x2, int y2, int z2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2) + pow(z2 - z1, 2));
    }

    public static void main(String[] args) {
        System.out.println("Формулы площади для любого треугольника \n" + AreaOfTriangle(5, 3));
        System.out.println("Площадь треугольника через две стороны и угол между ними.\n" + AreaOfTriangle(5, 3,30));
        System.out.println("Площадь треугольника через описанную окружность и стороны \n" + AreaOfTriangle( 4, 3,6, 3));
        System.out.println("Площадь треугольника через вписанную окружность и стороны. \n" + InscribedCircleAndSides( 4, 3, 2, 1));
        System.out.println("Площадь треугольника по стороне и двум прилежащим углам \n"+SideAndTwoAdjacentAngles(5,30,30));
        System.out.println("Формула Герона \n"+HeronsFormula(3,6,7));
        System.out.println("\n"+Distance(1, 1, 2, 2));
        System.out.println(Distance(1, 1, 1, 2, 2, 2));
    }
}