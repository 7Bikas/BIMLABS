

import java.util.Scanner;

public class QueueLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node front = null;
    Node rear = null;
    Scanner sc = new Scanner(System.in);
    
    public void enqueue(){
        System.out.println("Enter the data:");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        if(front == null){
            front = new_node;
            rear = new_node;
            System.out.println("Item inserted successfully!");
        }else{
            rear.next=new_node;
            rear = new_node;
            System.out.println("Item inserted successfully!");
        }
    }
    public void dequeue(){
        if(front == null){
            System.out.println("Queue is empty!");
        }else{
            front = front.next;
            System.out.println("Item dequeued successfully!");
        }
    }
    public void traversal(){
        Node temp = front;
        System.out.println("Data in Queue is:");
        while(temp!=null){
            System.out.println(" "+temp.data);
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        QueueLinkedList qll = new QueueLinkedList();
        qll.enqueue();
        qll.enqueue();
        qll.dequeue();
        qll.traversal();
    }
    
}
