package Practicalno2.Practicalno3;
class Number{
   private int x;
   private int y;
   public Number (){
    x=0;
    y=0;
   }
   public Number (int x, int y){
    this.x=x;
    this.y=y;
   }
   public void findOdd(){
    System.out.println("\nEven number are: ");
    for(int i=x;i<=y;i++){
        if(i%2==0){
            System.out.print(i+", ");
        }
    }
   }
   public void findEven(){
    System.out.println("\nOdd number are: ");
    for(int i=x;i<=y;i++){
        if(i%2!=0){
            System.out.print(i+", ");
        }
    }
   }

}
public class Qn3 {
    public static void main(String[] args) {
        Number n1=new Number(4,15);
        n1.findEven();
        n1.findOdd();
    }
    
}
