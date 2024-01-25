/*
WAP to ask user to enter the size of array and input the name of  person and find out the char is 
last character is a or  not print the name whose last letter end with a
 */
package practice;

import java.util.Scanner;
public class Stringhandalling {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
      
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
          String  []hari= new String[n];
        System.out.println("Enter name:");
        for(int i=0;i<hari.length;i++ ){
            hari[i]=sc.next();
        }
        System.out.println("Name end with letter a are :");
        for(int i=0;i<hari.length;i++){
            String bb= hari[i];
            char check=bb.charAt(bb.length()-1);
            if(check=='a'){
                System.out.println(hari[i]);
            }
         
        }
    }
    
}
