/*
 9. Create an abstract class FMachine having methods getData() and putData(). Derive a 
class Airplane having instance variable code, name, capacity and methods getData() 
and putData() that overrides method of abstract class to read and display the result. 
Create some instances of Airplane and call the required methods. 
 */
package Labsheet4;
abstract class FMachine{
    abstract void getData(String code, String name, String capacity); 
    abstract void putData();
}
class Airplane extends FMachine{
    String code, name, capacity;
      @Override
      public void getData(String code, String name, String capacity)
    {
    this.code=code;
    this.name=name;
    this.capacity=capacity;
    }
      @Override
      public void putData(){
          System.out.println("Name :"+name);
          System.out.println("Code :"+code);
          System.out.println("Capacity :"+capacity);
      }
    
} 
public class Qn9 {
    public static void main(String[] args) {
        Airplane a1= new Airplane();
        a1.getData("B12", "Bix1", "200");
        a1.putData();
    }
}
