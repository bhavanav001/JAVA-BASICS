package fabs.three;


class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void read(Book b) {   // Association
        System.out.println(name + " reads " + b.title);
    }
}

public class  association {
    public static void main(String[] args) {
        Student s1 = new Student("Anu");
        Book b1 = new Book("Java Basics");

        s1.read(b1);
    }
}
