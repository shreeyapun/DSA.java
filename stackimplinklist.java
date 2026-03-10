class Node{
    int data;
    Node  next;
    Node(int  data){
        this.data=data;
        this.next=null;

    }
} 
public class stackimplinklist {
    static Node top=null;

    // Algorithm for push operation
    public  void push(int element){
        Node newnode=new Node(20);
    
        //new node points to the current top
        newnode.next=top; 
       
        // top moves to new node
        top = newnode;
        System.out.println("push element:"+ element);
    }

    public int pop(){
        if(top==null){
            System.out.println("stack is empty! stack underflow");
            return -1;
        }
        int element = top.data;
        top=top.next;
        return element;
    }

    public static void main(String[] args){
        stackimplinklist stack= new stackimplinklist();
        stack.push(50);

        int poppedElement= stack.pop();
        System.out.println("popped element is "+poppedElement);
    }
}
