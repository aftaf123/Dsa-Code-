import java.util.Scanner;
public class Main{
    public Node head=null;
    public Node tail=null;
    public int count;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public void add(int k){
        Node newNode =new Node(k);
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
    public void Count(){
        Node curr=head;
        if(head==null){
          System.out.println(0);
        }
        else{
            do{
                count++;
                curr=curr.next;
            }
            while(curr!=head);
            System.out.println(count);
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Main m=new Main();
        System.out.println("Enter the length:");
        int len=sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<len;i++){
            int ll=sc.nextInt();
            m.add(ll);
        }
        System.out.print("The tolal number of count is: ");
        m.Count();
    } 
} 