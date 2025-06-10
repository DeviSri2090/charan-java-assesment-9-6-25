package shapes;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
<<<<<<< HEAD

    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
=======
    
    public double area() {
        return Math.PI * radius * radius;
    }
    
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

>>>>>>> 35c0480d18d4457a8f8d9350ad4aeda3f9f6fd36
    public String getName() {
        return "Circle";
    }
}
