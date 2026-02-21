
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
class Child1 extends Parent{
  int roll;
  Child1(String name,int age,int roll){
    super(name,age);
    this.roll=roll;
    }
    void show1(){
        System.out.println(name+" "+age+" "+roll);
    }
  }
  class Child2 extends Parent{
  int contact;
  Child2(String name,int age,int contact){
    super(name,age);
    this.contact=contact;
    }
    void show2(){
        System.out.println(name+" "+age+" "+contact);
    }
  }
public class hin {
  public static void main(String[] args) {
        Child1 c1= new Child1("bhavs",24,56);
        c1.show1();
        Child2 c2= new Child2("bhavs",24,578992306);
        c2.show2();
  
}
}


