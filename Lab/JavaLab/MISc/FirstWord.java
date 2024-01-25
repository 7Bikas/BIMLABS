
package MISc;
import java.util.*;
public class FirstWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String arr[]=new String[5];
        System.out.println("Enter any five name :");
        for(int i=0;i<5;i++){
            arr[i]=sc.next();
        }
        System.out.println("Name start with s letter are :");
        for(int i=0;i<5;i++){
            String s=arr[i];
            if(s.charAt(0)=='A'||s.charAt(0)=='a'){
                System.out.println(s);
            }
        }
    }
    
}
