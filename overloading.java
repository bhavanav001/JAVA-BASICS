// Base class
class Shape {
    void calculateArea() {
        System.out.println("Area calculation not defined");
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class
public class overloading {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        r.calculateArea();

        Circle c = new Circle(3);
        c.calculateArea();
    }
}