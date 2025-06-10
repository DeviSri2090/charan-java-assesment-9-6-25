package MainClass;
import java.util.Scanner;
import shapes.Shape;
import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape (1. Circle (or) 2. Rectangle): ");
        int choice = scanner.nextInt();

        Shape newshape = null;

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                newshape = new Circle(radius);
                break;
            case 2:
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the height of the rectangle: ");
                double height = scanner.nextDouble();
                newshape = new Rectangle(width, height);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                scanner.close();
<<<<<<< HEAD:src/MainClass/Main.java
                return;
=======
                return; 
>>>>>>> 35c0480d18d4457a8f8d9350ad4aeda3f9f6fd36:src/Main.java
        }

        System.out.println("Shape: " + newshape.getName());
        System.out.println("Area: " + newshape.area());
        System.out.println("Perimeter: " + newshape.perimeter());

        scanner.close();
    }
}