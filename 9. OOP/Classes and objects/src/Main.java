public class Main {
    public static void main(String[] args) {
        Student john = new Student();
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(1, 3);
        System.out.println(Point.PointsCount);
        System.out.println(p1.GetDistance(p2));

        Mathematics mathematics = new Mathematics();
        Mathematics.Factorial factorial = mathematics.getFactorial(5);

        System.out.printf("%d: %d\n", factorial.getKey(), factorial.getResult());

        Point3D p4 = new Point3D(5, 8, 3);
    }
}