class Point {
    int x;
    int y;
}

public class CallByReference {

    public static void swapCoordinates(Point point) {
        int temp = point.x;
        point.x = point.y;
        point.y = temp;
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.x = 5;
        p.y = 10;

        System.out.println("Before swap: Point coordinates are (" + p.x + ", " + p.y + ")");
        swapCoordinates(p);
        System.out.println("After swap: Point coordinates are (" + p.x + ", " + p.y + ")");
    }
}

