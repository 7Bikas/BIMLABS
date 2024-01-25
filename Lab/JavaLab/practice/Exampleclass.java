class   Shape {
   public void  bikas(){
        System.out.println("This is shape .");
    }
}
class Rectangle extends Shape {
  public void   nabin(){
        System.out.println("This is rectangle .");
    }
}
class Circle extends Shape {
public void hari(){
        System.out.println("This is circle " );
    }
}
class Square extends Rectangle{
    public void rohan(){
        System.out.println("This is square.");
    }

} 
class Exampleclass{
    public static void main(String[] args) {
        Square s1=new Square();
        s1.rohan();
        s1.nabin();
        s1.bikas();
        Circle c1= new Circle();
        c1.hari();
    }
}