public class LinearEquation {
    // instance variables:
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int rise;
    private int run;

    // constructor
    LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // methods:
    private double slope(){
        rise = y2 - y1;
        run = x2 - x1;
        double slope = (double)rise / run;
        slope = Math.round(slope * 100);
        slope = (double) (slope / 100);
        return slope;
    }

    private double yIntercept(){
        // y = mx + b
        // y1 = (slope() * x1) + yIntercept
        double yIntercept = (y1 - (slope() * x1));
        yIntercept = Math.round(yIntercept * 100);
        yIntercept = (double) (yIntercept / 100);
        return yIntercept;
    }

    private String slopeInterceptForm(){
        String slopeInterceptForm = ("(" + rise + "/" + run + ")" + "x + " + yIntercept());
        return slopeInterceptForm;
    }

    private double distance(){
        // a^2 + b^2 = c^2
        int x = Math.abs(x2 - x1);
        int y = Math.abs(y2 - y1);
        double distance = Math.sqrt((x * x) + (y * y));
        distance = Math.round(distance * 100);
        distance = (double) (distance / 100);
        return distance;
    }

    // prints all instance information
    public String toString(){
        String info = "First Pair: (" + x1 + ", " + y1 + ")" + "\n";
        info += "Second Pair: (" + x2 + ", " + y2 + ")" + "\n";
        info += "Slope of line: " + slope() + "\n";
        info += "Y-intercept: " + yIntercept() + "\n";
        info += "Slope Intercept Form: " + slopeInterceptForm() + "\n";
        info += "Distance between points: " + distance();
        return info;
    }

    public String solvedCoordinatePoint(double xValue){
        double yValue = (slope() * xValue) + yIntercept();
        String solvedCoordinatePoint = ("(" + xValue + ", " + yValue + ")");
        return solvedCoordinatePoint;
    }

}