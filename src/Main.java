import java.util.*;
public class Main {
    public static void main(String[] args) {
        double velocity;
        double angle;
        double distance;
        double elevation;
        double size;
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter the velocity");
        velocity = UserInput.nextDouble();
        System.out.println("Enter the angle (in degrees) above the ground at which the cannonball is fired");
        angle = UserInput.nextDouble();
        System.out.println("Enter the horizontal distance (in feet) to the target");
        distance = UserInput.nextDouble();
        System.out.println("Enter the height (in feet) of the bottom of the target from the ground");
        elevation = UserInput.nextDouble();
        System.out.println("Enter how tall the object is from the lowest to highest point");
        size = UserInput.nextDouble();
        double vResult = velocity * Math.cos(angle * (Math.PI / 180));
        double time = distance / vResult;
        double height = velocity * time * Math.sin(angle * (Math.PI / 180)) - ((32.17 * (Math.pow(time, 2))) / 2);

        if (vResult == 0) {
            System.out.println("Invalid input");
        } else if (height < 0) {
            System.out.println("This means that the cannonball did not even reach the target.");
        } else if (height > 0 && height < elevation) {
            System.out.println("This means the cannonball went under the target, the height was " + height + " feet");
        } else if (height > elevation && height < elevation+size) {
            System.out.println("Cannonball hit the target.");
        } else if (height > elevation+size) {
            System.out.println("Cannonball went over the top of the target, at "+height+"feet");
        }
    }

}
