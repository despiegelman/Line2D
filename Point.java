public class Point{
    int x;
    int y;
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int xValue, int yValue){
        x = xValue;
        y = yValue;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int newValue){
        x = newValue;
    }
    public void setY(int newValue){
        y = newValue;
    }
    public int manhattanDistance(Point other){
        int horizontal = Math.abs(this.getX()-other.getX());
        int vertical = Math.abs(this.getY()-other.getY());
        return(horizontal + vertical);
    }
    public boolean isCollinear(Point p1, Point p2){
        if (p1.getX()-p2.getX() != 0 && p1.getX()-this.getX() != 0){
            double slope1 = (double)(p1.getY()-p2.getY())/(p1.getX()-p2.getX());
            double slope2 = (double)(p1.getY()-this.getY())/(p1.getX()-this.getX());
            return (slope1-0.01 <= slope2 && slope2 <= slope1+0.01);
        }
        else{
            if ((p1.getX()-p2.getX() == 0) && (p1.getX()-this.getX() == 0)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}