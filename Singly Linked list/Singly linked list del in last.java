import java.util.Scanner;
public class Main{
    public Node head=null;
    public Node tail=null;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public void addNode(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    
    public void delFromLast(){
        if(head==null){
            System.out.println("Empty linked list");
            return;
        }
        else{
            if(head!=tail){
            Node cur=head;
            while(cur.next!=tail){
                cur=cur.next;
            }
            tail=cur;
            tail.next=null;
        }
        else{
            head=tail=null;
        }
    }
    }
    public void Display(){
        Node cur=head;
      
        if(head==null){
            System.out.println("The Linked list is empty:");
            return;
        }
         
        else{
            while(cur!=null){
                System.out.print(cur.data +" ");
                cur=cur.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Main m=new Main();
        System.out.println("Enter the length of the linked list:");
        int l=sc.nextInt();
        System.out.println("enter value: ");
        for(int i=0;i<l;i++){
            int n1=sc.nextInt();
            m.addNode(n1);
        }
         System.out.println("Your linked list is : ");
        m.Display();
        
        while(m.head != null) {  
              m.delFromLast();  
            
            System.out.println("Updated List: ");  
            m.Display();  
        }  
    }
    
}