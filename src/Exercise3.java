import java.util.ArrayList;

public class Exercise3 {
    public static void RunA() {
        ArrayList<Point> points = makeRandomPointList(1000, 0, 0, 500, 500);
        Point p_closest = findClosestTo(250, 250, points);
        System.out.println( "Closest point: " + p_closest.toString() );
    }

    private static ArrayList<Point> makeRandomPointList(int num, int x_min, int y_min, int x_max, int y_max) {
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int x = (int)(x_min + Math.random() * (x_max - x_min));
            int y = (int)(y_min + Math.random() * (y_max - y_min));
            Point p = new Point(x, y);
            points.add( p );
        }
        return points;
    }

    private static Point findClosestTo(int x, int y, ArrayList<Point> points) {
        Point p_target = new Point(x, y);
        Point p_closest = new Point();

        double dist_min = Double.MAX_VALUE;
        for (Point point : points) {
            double dist = p_target.distance(point);
            if (dist < dist_min) {
                p_closest = point;
                dist_min = dist;
            }
        }
        return p_closest;
    }


    //**************************************************
    public static void RunB() {
        ArrayList<Point> points = makeRandomPointList(1000, 0, 0, 500, 500);
        ArrayList<Point> list_p_furthest = findFurthestPair(points);
        System.out.print("Furtest point pair: ");
        for (Point point : list_p_furthest) {
            System.out.print( point.toString() + " ");
        }
        System.out.println();
    }

    private static ArrayList<Point> findFurthestPair(ArrayList<Point> points) {
        ArrayList<Point> list_p_furthest = new ArrayList<>();

        double dist_max = Double.MIN_VALUE;
        for (int i = 0; i < points.size(); i++) {
            Point p1 = points.get(i);
            for (int j = i+1; j < points.size(); j++) {
                Point p2 = points.get(j);
                double dist = p1.distance( p2 );
                if ( dist > dist_max ) {
                    list_p_furthest.clear();
                    list_p_furthest.add( p1 );
                    list_p_furthest.add( p2 );
                    dist_max = dist;
                }
            }
        }
        return list_p_furthest;
    }

    //**************************************************
    public static void RunC() {
        ArrayList<Point> points = makeRandomPointList(1000, 0, 0, 500, 500);
        ArrayList<Point> list_p_closest = findClosestPair(points);
        System.out.print("Closest point pair: ");
        for (Point point : list_p_closest) {
            System.out.print( point.toString() + " ");
        }
        System.out.println();
    }

    private static ArrayList<Point> findClosestPair(ArrayList<Point> points) {
        ArrayList<Point> list_p_furthest = new ArrayList<>();

        double dist_min = Double.MAX_VALUE;
        for (int i = 0; i < points.size(); i++) {
            Point p1 = points.get(i);
            for (int j = i+1; j < points.size(); j++) {
                Point p2 = points.get(j);
                double dist = p1.distance( p2 );
                if ( dist < dist_min ) {
                    list_p_furthest.clear();
                    list_p_furthest.add( p1 );
                    list_p_furthest.add( p2 );
                    dist_min = dist;
//                    System.out.println("[DEBUG] " + i + " " + j + " " + dist);
                }
            }
        }
        return list_p_furthest;
    }


    //**************************************************
    public static void RunD(double area_target) {
        ArrayList<Point> points = makeRandomPointList(1000, 0, 0, 500, 500);
        ArrayList<Point> list_p_triangle = findLargestTriangleLessThan(area_target, points);
        System.out.print("Points of the triangle with the highest area less than " + area_target + ": ");
        for (Point point : list_p_triangle) {
            System.out.print( point.toString() + " ");
        }
        System.out.println();
    }

    private static ArrayList<Point> findLargestTriangleLessThan(double area_target, ArrayList<Point> points) {
        ArrayList<Point> list_p_triangle = new ArrayList<>();

        double area_max = Double.MIN_VALUE;
        for (int i = 0; i < points.size(); i++) {
            Point p1 = points.get(i);
            for (int j = i+1; j < points.size(); j++) {
                Point p2 = points.get(j);
                for (int k = j+1; k < points.size(); k++) {
                    Point p3 = points.get(k);
                    double area = p1.area( p2, p3 );
                    if ( area < area_target && area > area_max ) {
                        list_p_triangle.clear();
                        list_p_triangle.add(p1);
                        list_p_triangle.add(p2);
                        list_p_triangle.add(p3);
                        area_max = area;
                        System.out.println("@D area: " + area);
                    }
                }
            }
        }
        return list_p_triangle;
    }

}
