public class TestLine2D {
    public static void main (String[]args){
        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        Point p3 = new Point(4, 9);
        Point p4 = new Point(6, 8);
        System.out.println("The end points: ");
        System.out.println("p1: x=" + p1.getX() + ", y=" + p1.getY());
        System.out.println("p2: x=" + p2.getX() + ", y=" + p2.getY());
        System.out.println("p3: x=" + p3.getX() + ", y=" + p3.getY());
        System.out.println("p4: x=" + p4.getX() + ", y=" + p4.getY());

        Line2D line1 = new Line2D(p1, p2);
        Line2D line2 = new Line2D(p3, p4);
        Line2D line3 = new Line2D(4, 9, 6, 8);
        System.out.println("\nTesting constructor using 2 Point objects and the ToString method");
        System.out.println("Line 1: " + line1);
        System.out.println("Line 2: " + line2);
        System.out.println("\nTesting constructor using 4 ints and the ToString method");
        System.out.println("Line 3: " + line3);
        System.out.println("\nTesting getP1 and get P2 methods:");
        System.out.println("Line 1, getP1: x=" + (line1.getP1()).getX() + ", y=" + (line1.getP1()).getY());
        System.out.println("Line 1, getP2: x=" + (line1.getP2()).getX() + ", y=" + (line1.getP2()).getY());
        System.out.println("Line 2, getP1: x=" + (line2.getP1()).getX() + ", y=" + (line2.getP1()).getY());
        System.out.println("Line 2, getP2: x=" + (line2.getP2()).getX() + ", y=" + (line2.getP2()).getY());
        System.out.println("\nTesting getSlope:");
        System.out.println("Line 1 slope: " + line1.getSlope());
        System.out.println("Line 2 slope: " + line2.getSlope());
        System.out.println("\nTesting isCollinear:");
        System.out.println("Line 1 and p3: " + line1.isCollinear(p3));
        System.out.println("Line 1 and p4: " + line1.isCollinear(p4));
    }
}
