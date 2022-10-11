public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    private double slope(){
        double rise = y2 - y1;
        int run = x2 - x1;
        double slope = rise / run;
        return slope;
    }

    private int yIntercept(){
        // y1 = slope() * x1 + b
    }


}
