
package Orchid;
class A{
  public void Nabin(){
      System.out.println("This is nabin.");
  }  
}
class B extends A{
    public void harry(){
        System.out.println("This is harry.");
    }
    
}

public class Qn14 {
    public static void main(String[] args) {
       B a=new B();
       a.Nabin();
       a.harry();
       
    }  
}
