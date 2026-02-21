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
  class SubChild extends Child{
    int contact;
    SubChild(String name,int age,int roll,int contact){
      super(name ,age,roll);
      this.contact=contact;
    }
    void show1(){
        System.out.println(name+" "+age+" "+roll+" "+contact);
    }
  }
  class min{
        
 public static void main(String[] args) {
        SubChild c= new SubChild("bhavs",24,56,769808);
        c.show1();
      }
    }