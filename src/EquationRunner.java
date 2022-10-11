import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Step 1 & 2: Asking user for coordinate points
        System.out.print("Enter the first x-y coordinate point: ");
        String firstPoint = s.nextLine();
        System.out.print("Enter the second x-y coordinate point: ");
        String secondPoint = s.nextLine();

        // Step 3: Parsing out the x and y values of both coordinate points
        int firstComma = firstPoint.indexOf(",");
        int x1 = Integer.parseInt(firstPoint.substring(1, firstComma));
        int y1 = Integer.parseInt(firstPoint.substring(firstComma + 1, firstPoint.length() - 1));

        int secondComma = secondPoint.indexOf(",");
        int x2 = Integer.parseInt(secondPoint.substring(1, secondComma));
        int y2 = Integer.parseInt(secondPoint.substring(secondComma + 1, secondPoint.length() - 1));

        // Step 4: Calling the LinearEquation constructor
        LinearEquation slopeEquation = new LinearEquation(x1, y1, x2, y2);

        // Step 5: Print out the information of the instance
        slopeEquation.toString();

        // Step 6: Asking the user to input an x-value
        System.out.print("Enter an x-value: ");
        double xValue = s.nextDouble();

        //
        String solvedCoordinatePoint = slopeEquation.solvedCoordinatePoint(xValue);
        System.out.println("Solved coordinate plane is: " + solvedCoordinatePoint);
    }
}
