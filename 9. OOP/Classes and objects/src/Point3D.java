public class Point3D extends Point {
    private int z;
    // Правило 1: В дочернем классе необходимо вызывать конструктор родительского класса.
    Point3D(int x, int y, int z) {
        // super - обращение к базовому классу
        super(x, y);
        this.z = z;
    }

    // @Override - помогает проверить, что мы переопределяем именно базовый метод
    @Override
    public String getClassName() {
        return "Point3D";
    }

    double GetDistance(Point3D p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2) + Math.pow(this.z - p.z, 2));
    }
}
