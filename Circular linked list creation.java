import java.util.Scanner;
public class Main{
    public Node head=null;
    public Node tail=null;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void add(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
            
        }
        else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }
    public void Display(){
        Node curr=head;
        if(head==null){
            System.out.println("Empty");
        }
        else{
           do{
            System.out.print(curr.data +" ");
         curr=curr.next;
        }
        while(curr!=head);
 
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Main m=new Main();
        System.out.println("enter length");
        int l=sc.nextInt();
        System.out.println("Enter elements :");
        for(int i=0;i<l;i++){
            int ll=sc.nextInt();
            m.add(ll);
        }
        System.out.println("Your linked list is :");
        m.Display();
        
    }
}