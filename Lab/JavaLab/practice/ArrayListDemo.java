
package practice;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <String >all= new ArrayList <String>();
        all.add("Bikas");
        all.add("Rohan");
        all.add("Hari");
        all.add("Nabin");
        //accesing data from array list usin for each loop 
        System.out.println("--------------------");
        for(String a:all){
            System.out.println(a);
        }
        //accesing data 
        System.out.println(all.get(0));
        System.out.println(all.get(3));
        System.out.println("************");
        //accesing data by using for loop 
        for(int i=0;i<all.size();i++){
            System.out.println((i));
        }
    }
}
