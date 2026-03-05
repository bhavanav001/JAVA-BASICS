package agg2.comp1;
class Book{
  String title;//attributes 
  Book(String title){
    this.title=title;
  }

}
class Library{
  String name;
  Book book;
  Library(String name,String title)//constructor 
  {
    this.name=name;
    this.book=new Book(title);


  }
  void show(){
    System.out.println(name+"has book"+book.title);

  }
}
public class comp2 {
  public static void main(String[] args){
    Library l=new Library("CL","JAVA");
   l.show();
  
    
  }
}
