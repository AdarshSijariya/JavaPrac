import java.util.*;

public class Clock {

    public static int calculateCost(double initialHourAngle, double initialMinuteAngle, int targetAngle, int A, int B, int X, int Y) {
        double currentAngle = Math.abs(initialHourAngle - initialMinuteAngle);
        if (currentAngle > 360) currentAngle %= 360;

        double interiorAngle = currentAngle;
        double exteriorAngle = 360 - currentAngle;

        double moveInterior = Math.abs(interiorAngle - targetAngle);
        double moveExterior = Math.abs(exteriorAngle - targetAngle);

        double clockwiseCost = moveInterior * A * X + moveExterior * B * Y;
        double antiClockwiseCost = moveInterior * B * X + moveExterior * A * Y;

        return (int) Math.min(clockwiseCost, antiClockwiseCost);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] time = scanner.nextLine().split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);

        int Q = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        double initialHourAngle = (30 * hours) + (0.5 * minutes);
        double initialMinuteAngle = 6 * minutes;

        int totalCost = 0;
        for (int i = 0; i < Q; i++) {
            int targetAngle = scanner.nextInt();
            totalCost += calculateCost(initialHourAngle, initialMinuteAngle, targetAngle, A, B, X, Y);
        }

        System.out.println(totalCost);

        scanner.close();
    }
}