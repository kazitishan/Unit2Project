public class LinearEquation {
    // instance variables:
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // constructor
    LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // methods:
    private double slope(){
        double rise = y2 - y1;
        int run = x2 - x1;
        double slope = rise / run;
        return slope;
    }

    private int yIntercept(){
        // y = mx + b
        // y1 = (slope() * x1) + yIntercept
        int yIntercept = (int) (y1 - (slope() * x1));
        return yIntercept;
    }

    private String slopeInterceptForm(){
        String slopeInterceptForm = (slope() + "x + " + yIntercept());
        return slopeInterceptForm;
    }

    private double distance(){
        // a^2 + b^2 = c^2
        int a = Math.abs(x2 - x1);
        int b = Math.abs(y2 - y1);
        double c = Math.sqrt((a * a) + (b * b));
        return c;
    }

    // prints all instance information
    public String toString(){
        System.out.println("First Pair: (" + x1 + ", " + y1 + ")");
        System.out.println("Second Pair: (" + x2 + ", " + y2 + ")");
        System.out.println("Slope of line: " + slope());
        System.out.println("Y-intercept: " + yIntercept());
        System.out.println("Slope Intercept Form: " + slopeInterceptForm());
        System.out.printf("Distance between points: %.2f%n", distance());
        return null;
    }

    public String solvedCoordinatePoint(double xValue){
        double yValue = (slope() * xValue) + yIntercept();
        String solvedCoordinatePoint = ("(" + xValue + ", " + yValue + ")");
        return solvedCoordinatePoint;
    }

}
