import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter coefficient of a:");
        double a = input.nextDouble();

        System.out.println("Enter coefficient of b:");
        double b = input.nextDouble();

        System.out.println("Enter coefficient of c:");
        double c = input.nextDouble();

        double d = b * b - 4 * a * c; // discriminant

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are real and distinct.");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        } else if (d == 0) {
            double r1 = -b / (2 * a);
            System.out.println("The roots are real and equal.");
            System.out.println("Root 1 = Root 2 = " + r1);
        } else {
            double realPart = -b / (2 * a);
            double imgPart = Math.sqrt(-d) / (2 * a);
            System.out.println("The roots are complex and imaginary.");
            System.out.println("Root 1 = " + realPart + " + " + imgPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imgPart + "i");
        }

        input.close();
    }
}
