import java.util.Scanner;
public class LinearQueue {
    final int initialvalue=-1;
     int front;
     int rear=initialvalue;
     final int size=5;
     int [] queue= new int [size];
     int item;
     LinearQueue(){
        front=initialvalue;
        rear=initialvalue;
     }
     
     Scanner sc= new Scanner(System.in);
     public boolean isFull(){
        if(rear==size-1)
        return true;//executive sentence 
        return false;
     }
     public boolean isEmpty(){
        if(front==-1)
        return true;
        return false;
     }
     public void input() {
        System.out.println("Please choose from given option:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Traverse");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                enQueue();
                break;
            case 2:
                deQueue();
                break;
            case 3:
                traverse();
                break;
            case 4:
                System.out.println("Thank you!!");
                System.exit(0);
            default:
                System.out.println("Invalid Choice!!");
        }
        }
     public void enQueue(){
        if(isFull()){
            System.out.println("Queue is full");//declerative sentence 
        }
        else{
            if(front==-1){
                front=0;
            }
            else{
                rear++;
                input();
                queue[rear]=item;
                System.out.println("Element inserted!!"+item);
            }
        }
     }
     public void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty!!");
        }else{
            if(front>=rear){
                front=-1;
                rear=-1;
            }
            System.out.println("Dequeue element is :"+queue[front]);
            front++;
        }
     }
     public void traverse(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Elements are :");
            for(int i=front; i<=rear;i++){
                System.out.print(queue[front]+",");
            }
        }
     }
  public static void main(String[] args) {
    LinearQueueArray queue = new LinearQueueArray();
    queue.input();
  }  
}
