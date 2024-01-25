
import java.util.Scanner;

public class Stackll {
    int data;
    Stackll next;
    Stackll(int data){
        this.data=data;
        this.next=null;
    }
        Stackll top=null;
        Scanner sc = new Scanner(System.in);
    public void push(){
        System.out.println("Enter the data:");
        data = sc.nextInt();
        Stackll new_node = new Stackll(data);
        if(top==null){
            top = new_node;
            System.out.println("Data inserted successfully!");
            choice();
        }else{
            new_node.next=top;
            top = new_node;
            System.out.println("Data inserted successfully!");
            choice();
        }
    } 
    public void pop(){
        if(top==null){
            System.out.println("Stack is Empty!");
            choice();
        }else{
            top = top.next;
            System.out.println("Data deleted successfully!");
            choice();
        }
    }
    public void peek(){
        System.out.println("Top element is "+top.data);
        choice();
    }
    public void input(){
        System.out.println("1 to push()\t 2 to pop()\t 3 to peek() \t 4 to exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                push();
                break;
            case 2:
                pop();
                break;
            case 3:
                peek();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
            }
        }
    public void choice(){
        System.out.println("Do you want to continue?(y/n)");
        char choice=sc.next().charAt(0);
        if(choice=='y'||choice=='Y')
            input();
        else{
            System.out.println("Thank you for your time.");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        Stackll sll = new Stackll(0);
        sll.input();
    }
}
