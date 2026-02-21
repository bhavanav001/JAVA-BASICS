
class Student {

    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    // Setter methods
    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }
}

public class encapsulate {

    public static void main(String[] args) {

        // Correct object creation
        Student s = new Student("abc", 24);

        System.out.println(s.getName());
        System.out.println(s.getAge());

        // Changing values using setters
        s.setName("Bhavana");
        s.setAge(20);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}

 