package fabs.three;


class Heart {
    void beat() {
        System.out.println("Heart is beating");
    }
}

class Human {
    private Heart heart;   // Composition

    Human() {
        heart = new Heart();  // created inside
    }

    void live() {
        heart.beat();
    }
}

public class composition {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.live();
    }
}