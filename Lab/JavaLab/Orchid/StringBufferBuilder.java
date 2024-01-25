
package Orchid;


public class StringBufferBuilder {
    public static void main(String[] args) {
        StringBuffer s1= new StringBuffer("Hello Nabin");
        //finding capacity
        System.out.println("Capacity :"+s1.capacity());
        //appending something in s1
        s1.append(" I am Bikas )");
        System.out.println(s1);
        // for replace 
        s1.replace(2, 6, "Hey");
        System.out.println(s1);
        //delete 
        s1.delete(4, 7);
        //reverse
        s1.reverse();
        System.out.println(s1);
    }
    
}
