
package ErrorOnes;
import java.util.*;
public class Marks {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String div;
    String grade;

        System.out.println("Enter the marks you obtain out of 500:");
        double marks= sc.nextDouble();
        double per =marks/5;
        if(per<40){
            div ="Fail";
        }
        else if (per>=40 &&per<60)
        {
            div ="2nd Division";
        }
        else if (per>=60 &&per<80)
        {
            div ="1st  Division";
        }
        else if (per>=80 && per<=100)
        {
            div ="Distinction";
        }
        else{
            System.out.println("Percentage can not be more than 100%");
        }
        if( div== "Fail"){
            grade= "F";
        }
        else if( div =="2nd Division"){
            grade= "B";
        }
        else if( div==" 1st Division"){
            grade= "A";
        }
        else if( div=="Distinction"){
            grade= "A+";
        }
        else{
            System.out.println("Invalid ");
        }
        System.out.println("Percentage ="+per);
        System.out.println("Division ="+div);
        System.out.println("Grade= ="+grade);
        sc.close();
    }
    
}
