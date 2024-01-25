package Practicalno2;
/*WAP that ask student to enter hios /her marks of five subject and print the 
grade obtained .
a.  80-100->grade A
b. 60-79-> grade B
c. 40-59->grade C
d. BElow 40->geade F
 */
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double []marks= new double[5];
        int total=0;
        System.out.println("Enter the marks of 5 subject");
        for(int i=0;i<5;i++){
            System.out.println("Subject "+(i+1));
            marks[i]=sc.nextDouble();
            total+=marks[i];
        }
        sc.close();
        double per=total/5.0;
        if(per>=80 && per<100){
            System.out.println("Grade :A");
        }
        else if(per>=60 && per<80){
            System.out.println("Grade :B");
        }
        else if (per>=40 && per<60){
            System.out.println("Grade :C");
        }
        else{
            System.out.println("Grade :F");
        }  
    }
    
}
