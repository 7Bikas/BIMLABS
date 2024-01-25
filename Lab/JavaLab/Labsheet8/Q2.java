/*
 */
package Labsheet8;
public class Q2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        
        // 1. append() function
        sb.append("World");
        System.out.println("After append: " + sb);
        
        // 2. insert() function
        sb.insert(5, "Java ");
        System.out.println("After insert: " + sb);
        
        // 3. delete() function
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);
        
        // 4. replace() function
        sb.replace(5, 6, "J");
        System.out.println("After replace: " + sb);
        
        // 5. reverse() function
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        // 6. capacity() function
        int capacity = sb.capacity();
        System.out.println("Capacity: " + capacity);
        
        // 7. length() function
        int length = sb.length();
        System.out.println("Length: " + length);
    }
}
