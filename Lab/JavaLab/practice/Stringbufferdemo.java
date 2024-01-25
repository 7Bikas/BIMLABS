
package practice;


public class Stringbufferdemo {
    public static void main(String[] args) {
        //using string buffer 
        System.out.println("Rohan bro");
        StringBuffer str1= new StringBuffer("Hello Hari Bro");
        //finding capcity
        System.out.println(str1.capacity());
        //appending some string on str1
        str1.append(" Rohan has girlfriend.");
        System.out.println(str1);
        //aading new string in specified position 
        str1.insert(5, "You");
        System.out.println(str1);
        //rplace 
        str1.replace(0, 9, "Why ");
        System.out.println(str1);
        //for delete
        str1.delete(19, 24);
        System.out.println(str1);
    }
    
}
