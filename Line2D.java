public class Line2D{
    Point point1;
    Point point2;
    public Line2D(Point p1, Point p2){
        point1 = p1;
        point2 = p2;
    }
    public Line2D(int x1, int y1, int x2, int y2){
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }
    public Point getP1(){
        return this.point1;
    }
    public Point getP2(){
        return this.point2;
    }
    public String toString(){
        return ("[(" + (this.point1).getX() + ", " + (this.point1).getY() + "), (" + (this.point2).getX() + ", " + (this.point2).getY() + ")]");
    }
    public double getSlope(){
        if ((this.point1).getX()-(this.point2).getX() == 0){
            throw new IllegalArgumentException("undefined slope");
        }
        else{
            return (double)((this.point1).getY()-(this.point2).getY())/((this.point1).getX()-(this.point2).getX());
        }
    }
    public boolean isCollinear(Point p){
        if (p.getX() == 0){
            throw new IllegalArgumentException("undefined slope");
        }
        else{
            double slopeOfP = (double)(p.getY())/(p.getX());
            return (this.getSlope()-0.01 <= slopeOfP && this.getSlope()+0.01 >= slopeOfP);
        }
    }
}