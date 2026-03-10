import java.util.Scanner;

public class linkedlist{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int _data){
           this.data=_data;
           this.next=null;
            
        }

        
    }
// 1. insert at beginning
    public void insertAtBeginning(int element){
        Node newNode=new Node(element);
        newNode.next=head;
        head=newNode;
        System.out.println("element inserted at beginning");

    }


    // 3. traverse
    public void traverse(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        System.out.println("list of element");
        while(temp!=null){
            System.out.println(temp.data+"");
            temp=temp.next;
        }
    }


    public static void main(String[] args){
        linkedlist linkedlist= new linkedlist();
        Scanner sc= new Scanner(System.in);

        while(true){
            System.out.println("=======linked list======");
            System.out.println("1.insert at beginning");
            System.out.println("2.insert at beginning");
            System.out.println("3.insert at beginning");
            System.out.println("4.insert at beginning");
            System.out.println("5.insert at beginning");
            System.out.println("6.insert at beginning");
            System.out.println("7.insert at beginning"); 
            System.out.println("8.insert at beginning");
            int choice= sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("enter a element");
                linkedlist.insertAtBeginning(sc.nextInt());
                break;
                case 3:
                    // System.out.println("display an element");
                    linkedlist.traverse();

            }

        }

    }

}