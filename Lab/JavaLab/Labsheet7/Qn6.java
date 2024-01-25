/*
6.	Write a program to demonstrate custom exception by inheriting exception class */
package Labsheet7;
class NegativeAge extends Exception{
    @Override
    public String toString(){
        return "Age can not be negative";
    }
}
class Age{
    public void display(int x) throws NegativeAge{
        if (x<1){
            throw new NegativeAge();
        }
        else{
            System.out.println("Your age is "+x);
        }
    }
}
public class Qn6 {
    public static void main(String[] args) {
        Age a1= new Age();
        try{
            a1.display(-2);
        }catch(NegativeAge na){
            System.out.println(na);
        }
        
    }
    
}
