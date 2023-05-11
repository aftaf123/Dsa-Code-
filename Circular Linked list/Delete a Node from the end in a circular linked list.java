import java.util.Scanner;
public class Main{
    public static Node head = null;
    public static Node tail = null;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void add(int k){
        Node ss = new Node(k);
        if(head==null){
            head=ss;
            tail=ss;
            ss.next=head;
        }
        else{
            tail.next=ss;
            tail=ss;
            tail.next=head;
        }
    }
    
    public void deleteEnd(){
        if(head==null){
            return;
        }
        else{
            if(head!=tail){
                Node cur = head;
                while(cur.next!=tail){
                    cur=cur.next;
                }
                tail = cur;
                tail.next = head;
            }
            else{
                head=tail=null;
            }
        }
    }
    public void display(){
        Node curr = head;
        if(head==null){
            System.out.println("Empty linked list .....");
            
        }
        else{
            do{
                System.out.print(curr.data + " ");
                curr=curr.next;
            }while(curr!=head);
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        System.out.println("Enter length :");
        int n = sc.nextInt();
        System.out.println("Enter element :");
        for(int i =0;i<n;i++){
            int n1 = sc.nextInt();
            m.add(n1);
        }
        System.out.println("Your linked list is :");
        m.display();
        System.out.println("After delete element from the end...");
        m.deleteEnd();
        m.display();
    }
}