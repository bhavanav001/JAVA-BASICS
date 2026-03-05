package fabs;
interface Student{
  void Show();
}
class Child implements Student{
  String name;
  int age;
  Child(String name,int age){
    this.name=name;
    this.age=age;

  }
  public void Show(){
    System.out.println(name+""+age);
  }
}
public class fab {
  public static void main(String[] args){
    Child s= new Child("ABC",25);
    s.Show();
  }
  
}
