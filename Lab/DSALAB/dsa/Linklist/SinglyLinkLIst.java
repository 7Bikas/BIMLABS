package Linklist;
import java.util.Scanner;

public class SinglyLinkLIst {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    Scanner sc= new Scanner (System.in);
    Node head=null;
    public void insertAtFirst(){
        int data;
        System.out.println("Enter the data :");
        data=sc.nextInt();
         Node new_node= new Node(data);
         if(head==null){
            head=new_node;
            choice();
         }
         else{
            new_node.next=head;
            head=new_node;
            choice();
         }
    }
    public void insertAtLast(){
        int data;
        System.out.println("Enter the data :");
        data=sc.nextInt();
        Node new_node= new Node(data);
        if(head==null){
            head=new_node;
            choice();
        }
        else{
             Node temp= head;
             while(temp.next!= null){
                temp= temp.next;
             }
             temp.next= new_node;

        }
        choice();
    }
    public void insertAtSpecificPosition(){
        int pos, data;
        System.out.println("Entera position :");
        pos=sc.nextInt();
        System.out.println("Enter the data to be inserted :");
        data=sc.nextInt();
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            choice();
        }
        else{
            Node temp1= head;
            for(int i=0;i<(pos-2);i++){
                temp1=temp1.next;
            }
            new_node.next=temp1.next;
            temp1.next=new_node;
        }
        choice();
    }
    public void deleteFromFirst(){
        if(head==null){
            System.out.println("Linked list is  empty");
            choice();
        }
        else{
            Node temp3=head;
            temp3=temp3.next;
            head=temp3;
            System.out.println("First node is deleted sucessfully .");
            choice();
        }
    }
    public void deleteFromLast(){
        if(head==null){
            System.out.println("Linked list is  empty");
            choice();
        }
        else{
            Node temp4=head;
            Node ptr=temp4.next;
            while(ptr.next!=null){
                temp4=ptr;
                ptr=ptr.next;
            }
            temp4.next=null;
            System.out.println("Last node is deleted.");
            choice();
        }
    }
    public void deleteFromSpecificPosition(){
        if(head==null){
            System.out.println("Linked list is  empty");
            choice();
        }
        else{
            System.out.println("Enter the position :");
            int pos=sc.nextInt();
            Node temp5=head;
            Node ptr1=temp5.next;
            for(int i=0;i<(pos-2);i++){
                 temp5=ptr1;
                 ptr1=ptr1.next;
            }
            temp5.next=ptr1.next;
            System.out.println("Node deleted from "+pos+"position !");
            choice();
        }
    }
    public void traversal(){
       Node temp2= head;
       if(head==null){
        System.out.println("Linkrd liost is empty");
        choice();
       }  
       else{
        while(temp2!=null){
            System.out.println(" "+temp2.data);
            temp2=temp2.next;
        }
        choice();
       }
    }

    public void choice (){
        System.out.println("Do you want to continue (y/n)");
        char choice =sc.next().charAt(0);
        if(choice=='y'||choice=='Y')
        input();
        else
        System.out.println("Thank you fornyour time.");
        System.exit(0);
    }
    public void input(){
        System.out.println("\n\t Please  choose from given:\n\t1.insertAtFirst\n\t 2.insertAtLast\n\t3.insertAtSpecificPosition\n\t4.deleteFromFirst\n\t5.deleteFromLast");
        System.out.println("\t6.deleteFromSpecificPosition\n\t7. traversal");
        int ch=sc.nextInt();
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
            case 4 :
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
            System.out.println("Sorry wrong input :");
        }
    }
    public static void main(String[] args) {
       SinglyLinkLIst list= new SinglyLinkLIst();
       list.input(); 
    }   
}
