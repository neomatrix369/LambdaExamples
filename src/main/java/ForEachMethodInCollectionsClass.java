import java.util.ArrayList;
import java.util.List;

public class ForEachMethodInCollectionsClass {
    public static void main(String[] args) {
        // forEach method example: pointList.forEach(p -> p.move(p.y, p.x));
        // pre-Java 8
        List<Point> oldStyleForLoop = new ArrayList<Point>();
        for (Point eachPoint:oldStyleForLoop) {
            eachPoint = eachPoint.move(eachPoint.x, eachPoint.y);
        }

        // Java 8
        List<Point> newStyleForEach = new ArrayList<Point>();
        newStyleForEach.forEach(p -> p.move(p.y, p.x));
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point move(int y, int x) {
        return new Point(x+1, y+2);
    }
}

