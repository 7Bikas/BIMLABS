package Practicalno2;
/*WAP to read annual salary of an employee and calculate the tax and print the actual 
amount received by the employee
a. Salary up to 100000->1%
b Salary above 100000 and below 5 lakh->5%
c. Salary above 5 lakhs->10;
 */
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your salary :");
        int salary=sc.nextInt();
        sc.close();
        int am=0;
        if(salary<=100000){
            am=salary-(salary*1/100);
        }
        else if(salary>100000 && salary<=500000){
            am=salary-((salary-100000)*5/100)-1000;
        }
        else{
             am=salary-((salary-500000)*10/100)-21000;
        }
        System.out.println("Actual salary after tax is Rs "+am);
    }
    
}
