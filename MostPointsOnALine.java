class Point {
    public int x;
    public int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class MostPointsOnALine {
    public int most(Point[] points) {
        // Assume input is not null, and input.length >= 2.
        // record the max number of points on the same line
        int res = 0;
        // we use each pair of points form a line
        for (int i = 0; i < points.length; i++) {
            // any line can be represented by a point and a slope.
            // we take the point as seed and try to find all possible slope.
            Point seed = points[i];
            // record the points with same <x, y>
            int same = 1;
            // record the points with same x, for the special case of
            // infinite slope
            int sameX = 0;
            // record the maximum number of points on the same line
            // crossing the seed point.
            int most = 0;
            // a map with all possible slopes
            HashMap<Double, Integer> cnt = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                Point tmp = points[j];
                if (tmp.x == seed.x && tmp.y == seed.y) {
                    // handle the points with same <x,y>
                    same++;
                } else if (tmp.x == seed.x) {
                    // handle the points with same x
                    sameX++;
                } else {
                    // otherwise, just calculate the slope and increment
                    // the counter for the calculated slope
                    // k = (y2 - y1) / (x2 - x1)
                    double slope = ((tmp.y - seed.y) + 0.0) / (tmp.x - seed.x);
                    /*
                    if (!cnt.containsKey(slope)) {
                        cnt.put(slope, 1);
                    } else {
                        cnt.put(slope, cnt.get(slope) + 1);
                    }
                    */

                    cnt.put(slope, cnt.getOrDefault(slope, 0) + 1);
                    // update the global max
                    most = Math.max(most, cnt.get(slope));
                }
            }
            System.out.println("same = " + same);
            System.out.println("sameX = " + sameX);
            most = Math.max(most, sameX) + same;
            res = Math.max(res, most);
        }
        return res;
    }

    public static void main(String[] args) {
        MostPointsOnALine soln = new MostPointsOnALine();

        Point a = new Point(2, 1);
        Point b = new Point(2, 3);
        Point c = new Point(1, 1);

        Point[] P = new Point[] {a, b, c};
        System.out.println("Expect Res = 1, for input = [<2,1>, <2,3>, <1,1>]");
        System.out.println("Actual Res = " + soln.most(P));


        Point d = new Point(1, 1);
        Point e = new Point(2, 2);
        Point[] P2 = new Point[] {d, e};
        System.out.println("Expect Res = 2, for input = [<1,1>, <2,2>]]");
        System.out.println("Actual Res = " + soln.most(P2));

        Point[] P3 = new Point[] {d, e, d};
        System.out.println("Expect Res = 3, for input = [<1,1>, <2,2>, <1,1>]]");
        System.out.println("Actual Res = " + soln.most(P3));
    }
}
