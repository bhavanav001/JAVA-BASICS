
 class Shape {
    double area;   // common property
}

class Triangle extends Shape {
    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    void calculateArea() {
        area = 0.5 * b * h;
        System.out.println("Triangle Area: " + area);
    }
}

class Rectangle extends Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    void calculateArea() {
        area = l * b;
        System.out.println("Rectangle Area: " + area);
    }
}

public class shape1 {
    public static void main(String[] args) {

        Triangle t = new Triangle(10, 5);
        t.calculateArea();

        Rectangle r = new Rectangle(4, 6);
        r.calculateArea();
    }
}