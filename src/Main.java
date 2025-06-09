import java.util.Scanner;
import shapes.Shape;
import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape (1. Circle or 2. Rectangle): ");
        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 2:
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the height of the rectangle: ");
                double height = scanner.nextDouble();
                shape = new Rectangle(width, height);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                scanner.close();
                return; // Terminate the program
        }

        System.out.println("Shape: " + shape.getName());
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());

        scanner.close();
    }
}
