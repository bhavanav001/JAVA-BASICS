interface School{
  void SchoolName();
}
class Student {
  String name;
  Student(String name){
    this.name=name;
  }
}

class C extends Student implements School{
  int roll;

  C(String name,int roll){
    super(name);
    this.roll=roll;
  }

  public void SchoolName(){
    System.out.println("max school");

  }
  public void show(){
    System.out.println(name+" "+roll);
  }
}
 public class heirachal{
  public static void main(String[] args)
  {
    C c=new C("bhavs",10);
    c.SchoolName();
    c.show();
  }
}
