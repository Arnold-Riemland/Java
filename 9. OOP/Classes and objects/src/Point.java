class Point {
    static int PointsCount = 0;
    // protected - модификатор доступа, который позволяет обращаться к полям и методам в классах наследниках.
    protected int x;
    protected int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        PointsCount++;
    }

    public String getClassName() {
        return "Point";
    }

    double GetDistance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}