
package Orchid;

class AgeException extends Exception{
    public String toString(){
      return "age cannot be negative ";  
    }
}
class Age{
    public void  age(int x)throws AgeException{
       if(x<1 || x>130){
           throw new AgeException();
    }
       else{
           System.out.println("Your age is "+x);
       }
}
}
public class Qn19 {
    public static void main(String[] args) {
        try{
            Age a1= new Age();
            a1.age(-2);
        }catch(AgeException ag){
            System.out.println(ag);
        }
    }
}
    

