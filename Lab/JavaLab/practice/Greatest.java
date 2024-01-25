import java.util.Scanner;
public class Greatest { 
    public static void main (String []args){
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter any three number :");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    sc.close();
    if(a>b)
    {
        if(a>c){
            System.out.println(a+"is Largest");
        }
        else{
            System.out.println(c+"Is largest");
        }
    }
    else if(b>c){
        System.out.println(c+"I largest");
    }
    else {
        System.out.println(c+"is Largest ");
    }
}
    
}
