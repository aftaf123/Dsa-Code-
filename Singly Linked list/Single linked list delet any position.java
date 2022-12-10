import java.util.Scanner;
public class Main{
    public Node head=null;
       public Node tail=null;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next = null;
    }
}
void insert(int key){
    Node sc= new Node(key);
    if(head==null)
    {
        head=sc;
        tail=sc;
    }
    else{
        tail.next=sc;
        tail=sc;
    }
}

void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;
 
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }
 
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
 
        // If key was not present in linked list
        if (temp == null)
            return;
 
        // Unlink the node from linked list
        prev.next = temp.next;
    }
    
    
    void Display(){
        Node cor=head;
        if(head==null){
            System.out.println("EMPTY");
        }
        else{
            while(cor!=null){
                System.out.print(cor.data + " ");
                cor=cor.next;
            }
        }
    }
    public static void main(String [] args){
        Main obj = new Main();
        Scanner ss=new Scanner(System.in);
        int len=ss.nextInt();
        for(int i =1;  i<=len; i++){
            obj.insert(ss.nextInt());
            
        }
        obj.Display();
        System.out.println();
        obj.deleteNode(ss.nextInt());
        obj.Display();
    }
}
