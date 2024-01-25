class Calculation1{         //super class
    private int x;
    private int y;
   public Calculation1(int x,int y)//constructor
   {
    this.x=x;
    this.y=y;
   }
   public void calc(){
    System.out.println("sum = "+(x+y)+"\nProduct = "+(x*y));
   }
}
   class Calculation2 extends Calculation1{
    private int a;//instance variable
    private int b;
    public Calculation2(int a, int b, int x, int y){
        super(x,y);
        this.a=a;
        this.b=b;
    }
    //method overriding condition
    public void calc(){
        super.calc();//calls super class calc
        System.out.println("Subtraction = "+(a-b));
    }
   } 
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Calculation2 c1 = new Calculation2(20, 30, 40, 50);
        c1.calc();//calls child's class
    }
}
