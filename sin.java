class Parent {
  String name;
  int age;
  Parent(String name,int age){
    this.name=name;
    this.age=age;
  }void display(){
    System.out.print(name+" "+age+" ");
  }
}
class Child extends Parent{
  int roll;
  Child(String name,int age,int roll){
    super(name,age);
    this.roll=roll;
    }
    void show(){
        System.out.println(name+" "+age+" "+roll);
    }
  }
public class sin {
  public static void main(String[] args) {
        Child c= new Child("bhavs",24,56);
        c.show();
        c.display();
  
}
}
