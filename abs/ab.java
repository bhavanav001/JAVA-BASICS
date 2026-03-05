package abs;
abstract class Student{
  String name;
  int age;

  Student(String name,int age){
    this.name=name;
    this.age=age;
  }

  abstract void Show();
}

class Child extends Student{
  int roll;

  Child(String name,int age,int roll){
    super(name,age);
    this.roll=roll;
  }

  void Show(){
    System.out.println(name+" "+age+" "+roll);
  }
}

public class ab{
  public static void main(String[] args){
    Child c=new Child("ABC",23,11);
    c.Show();
  }
}