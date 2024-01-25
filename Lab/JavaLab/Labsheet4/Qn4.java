/*. Define string array of size 10 and insert name of 10 student in it.
Then list the name of students that ends with letter ‘a’. 
 */
package Labsheet4;
import java.util.Scanner;
public class Qn4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String []arr = new String[10];
        System.out.println("Enter 10 names :");
        for(int i=0; i<10;i++){
            arr[i]=sc.next();
        }
        sc.close();
        System.out.println("Name end with 'a' are :");
        for(int i=0; i<arr.length;i++){
            int len =arr[i].length();
            if(arr[i].charAt(len-1)=='a'){
                System.out.println(arr[i]+", ");
            }
        }
    }
    
}
