package fabs.three;

 
  

class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }
}

class Car {
    Engine engine;   // Aggregation

    Car(Engine engine) {
        this.engine = engine;
    }

    void display() {
        System.out.println("Car has " + engine.type + " engine");
    }
}

public class aggression {
    public static void main(String[] args) {
        Engine e1 = new Engine("Petrol");  // created outside
        Car c1 = new Car(e1);

        c1.display();
    }
}
