
package Orchid;
import  java.util.*;
class Even{
    int sum=0;
    public void print(int a, int b){
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.print(i+",");
            }
        }
    }
}
public class Qn13 {
    public static void main(String[] args) {
        Even e1= new Even();
        e1.print(90, 100);
    }
    
}
