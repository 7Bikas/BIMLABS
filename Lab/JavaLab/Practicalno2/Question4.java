package Practicalno2;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double []marks= new double[5];
        int total=0;
        System.out.println("Enter the marks of 5 subject");
        for(int i=0;i<5;i++){
            System.out.println("Subject"+(i+1));
            marks[i]=sc.nextDouble();
            total+=marks[i];
        }
        sc.close();
        double per=total/5.0;
        if(per>=80){
            System.out.println("Division : Distinction ");
        }
        else if(per>=60 && per<80){
            System.out.println("Division : First division");
        }
        else if (per>=40 && per<60){
            System.out.println("Division : Second division");
        }
        else{
            System.out.println("You are Fail..");
        }
        System.out.println("Percentage :"+per);

    }
}