import java.util.Scanner;
public class LinkList{
    Node head=null;
    Node tail=null;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void AddNode(int data){
        Node newnode  =new Node(data);
        // System.out.println(newnode.data);
       if(head==null){
           head=newnode;
           tail=newnode;
       } 
       else{
           tail.next=newnode;
           tail=newnode;
       }
       
    }
    
    void insertfirst(int val){
        Node New = new Node(val);
        if(head==null){
            head = New;
            tail = New;
        }
        else{
            New.next = head;
            head = New;
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void Display(){
        Node curr=head;
        // System.out.println(curr.data);
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
       Scanner obj=new Scanner(System.in);
       LinkList a=new LinkList();
       int n=obj.nextInt();
       for(int i=0;i<n;i++){
           a.AddNode(obj.nextInt());
       }
       //a.Display();
       a.insertfirst(obj.nextInt());
       System.out.println();
       a.Display();
           }
    
}