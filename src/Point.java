public class Point {
    private int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point B) {
        return Math.sqrt( (B.getX() - x) * (B.getX() - x) + (B.getY() - y) * (B.getY() - y) );
    }

    public double area(Point B, Point C) {
        return (x * (B.getY() - C.getY()) + B.getX() * (C.getY() - y) + C.getX() * (y - B.getY() )) / 2.0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
