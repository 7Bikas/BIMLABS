
package Orchid;
//static method in java 
//static method dosn't depend of any state of any object
//they are associated with class rather  then instance of class 
class Bikas{
    public static void manjulika(){
        System.out.println("Hello hari bro.");
    }
}
public class M21Static {
    public static void main(String[] args) {
        Bikas.manjulika();
    }
    
}
