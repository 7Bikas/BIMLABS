/*
5.	write a program to take emp_id, emp_name, emp_address from user and then store it in file
called “Emp.txt”. after this copy the content of “Emp.txt” to “DB.txt”. Also display the 
content of “DB.txt” file.5.	write a program to take emp_id, emp_name, emp_address from user and 
then store it in file called “Emp.txt”. after this copy the content of “Emp.txt” to “DB.txt”.
Also display the content of “DB.txt” file.
 */
package Labsheet8;
import java.io.*;
import java.util.Scanner;
public class Qn5 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        String emp_id, emp_name, emp_address;
        System.out.println("Enter your id :");
        emp_id=sc.next();
        System.out.println("Enter your name :");
        emp_name=sc.next();
        System.out.println("Enter address :");
        emp_address=sc.next();
        try{
            File f1= new File("Emp.txt");
            if(!f1.exists()){
                f1.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream (f1);
            byte [] b1=emp_id.getBytes();
            fos.write(b1);
            byte []  b2= emp_name.getBytes();
            fos.write(b2);
            byte [] b3 = emp_address.getBytes();
            fos.write(b3);
            fos.close();
            //writing and reading in DB
            FileOutputStream fos1= new FileOutputStream("DB.txt");
            FileInputStream fis= new FileInputStream ("Emp.txt");
            int i;
            while((i=fis.read())!=-1){
                fos1.write(i);
            } 
            fos1.close();
            FileInputStream fis1= new FileInputStream("DB.txt");
            int c;
            while((c=fis1.read())!=-1){
                System.out.print((char)c);
            }
            fis1.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
