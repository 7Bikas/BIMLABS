
import java.util.Scanner;

public class CircularLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Scanner sc = new Scanner(System.in);
    Node head = null;
    Node tail = null;

    public void insertAtFirst(){
        int data;
        System.out.println("Enter the data:");
        data=sc.nextInt();
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
            tail=new_node;
            new_node.next=head;
        }
        else{
            new_node.next=head;
            head=new_node;
            tail.next=head;
        }
        choice();
    }

    public void insertAtLast(){
        int data;
        System.out.println("Enter the data:");
        data=sc.nextInt();
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
            tail=new_node;
            new_node.next=head;
        }else{
            tail.next = new_node;
            tail=new_node;
            new_node.next=head;
        }
        choice();
    }

   public void insertAtSpecificPosition(){
    int pos, data;
    System.out.println("Enter the position of the node:");
    pos = sc.nextInt();
    if(pos < 1){
        System.out.println("Invalid position!");
        choice();
        return;
    } else if(head == null || pos == 1){
        insertAtFirst();
    } else {
        Node temp1 = head;
        System.out.println("Enter the data:");
        data = sc.nextInt();
        Node new_node = new Node(data);
        for(int i = 0; i < (pos-2); i++){
            temp1 = temp1.next;
            if(temp1 == head){
                System.out.println("Invalid position!");
                choice();
                return;
            }
        }
        new_node.next = temp1.next;
        temp1.next = new_node;
        }
        choice();
    }
    public void deleteFromFirst(){
        if(head==null){
            System.out.println("Linked list is empty!");
        }else{
            head = head.next;
            tail.next = head;
            System.out.println("First Node deleted successfully!");
        }
        choice();
    }

    public void deleteFromLast(){
        if(head==null){
            System.out.println("Linked list is empty");
        }else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
            System.out.println("Last Node deleted successfully!");
        }
        choice();
    }

    public void deleteFromSpecificPosition(){
        if(head==null){
            System.out.println("Linked list is empty");
        }else{
            System.out.println("Enter the position to delete:");
            int pos = sc.nextInt();
            if(pos < 1){
                System.out.println("Invalid position!");
                choice();
                return;
            }else if(pos == 1){
                deleteFromFirst();
                return;
            }
            Node temp = head;
            for(int i=0; i < (pos-2); i++){
                temp = temp.next;
                if(temp == null || temp.next == head){
                    System.out.println("Invalid position!");
                    choice();
                    return;
                }
            }
            temp.next = temp.next.next;
            System.out.println("Node deleted from "+pos+" position!");
        }
        choice();
    }

    public void traversal(){
        Node temp = head;
        if(head==null){
            System.out.println("Linked List is empty!");
        }
        else{
            do{
                System.out.println(" "+temp.data);
                temp=temp.next;
            }while(temp!=head);
        }
        choice();
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

    public void input(){
        System.out.println(" \n 1)insertAtFirst() \n 2)insertAtLast() \n 3)insertAtSpecificPosition() \n 4)deleteFromFirst() \n 5)deleteFromLast() \n 6)deleteFromSpecificPosition() \n 7)traversal()");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                insertAtFirst();
                break;
            case 2:
                insertAtLast();
                break;
            case 3:
                insertAtSpecificPosition();
                break;
            case 4:
                deleteFromFirst();
                break;
            case 5:
                deleteFromLast();
                break;
            case 6:
                deleteFromSpecificPosition();
                break;
            case 7:
                traversal();
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.input();
    }
}