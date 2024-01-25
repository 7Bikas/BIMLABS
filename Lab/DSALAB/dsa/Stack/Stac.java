import java.util.Scanner;
class StackDemo{
    int item,top;
    int [] stack;
    public StackDemo(int size){
        stack=new int[size];
        top=1;
    }
    Scanner sc =new Scanner(System.in);
    public void push(){
        if (top==stack.length-1){
            System.out.println("Stak is overflow");
        }else{
            System.out.println("Enter element of stack :");
            item=sc.nextInt();
            top++;
            stack[top]=item;
        }
    }
    public void pop(){
        if (top==-1){
            System.out.println("Stack is underflow");
        }else{
            System.out.println("Popped"+stack[top]);
            top--;
        }
    }
    public void display(){
        if (top==-1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Element in stack are :");
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }
}
public class Stac{
    public static void main(String[] args) {
        int choice, size;
        final Scanner scan= new Scanner (System.in);
        System.out.println("Enter the size of stack :");
        size=scan.nextInt();
        StackDemo s1= new StackDemo(size);
        while(true){
            System.out.println("Enter \n 1 to push\t2 to pop\t3 to display\4 to exit");
            choice =scan.nextInt();
            switch(choice){
                case 1:
                s1.push();
                break;
                case 2:
                s1.pop();
                break;
                case 3:
                s1.display();;
                break;
                case 4:
                System.exit(0);
                break;
                default:
                System.out.println("Invalid choice ");
                scan.close();
            }
        }
    }
}