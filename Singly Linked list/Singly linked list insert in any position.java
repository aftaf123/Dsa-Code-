import java.util.Scanner;
public class Main{
    public Node head=null;
    public Node tail=null;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    void insert(int key){
        Node sc =new Node(key);
        if(head==null){
            head=sc;
            tail=sc;
        }
        else{
            tail.next=sc;
            tail=sc;
        }
    }
    
    void specificpos(int pos,int len,int ele){
        Node New = new Node(ele);
        Node cur = head;
        if(head == null){
            System.out.println("Empty linklist");
        }
        else{
            if(pos==1){
                New.next = head;
                head = New;
            }
            if(pos>=2 && pos<=len){
                for(int i=2;i<pos;i++){
                    cur = cur.next;
                }
                Node temp = cur.next;
                cur.next = New;
                New.next = temp;
            }
        }
    }
    void Display(){
        Node cur=head;
        if(cur==null){
            System.out.println("Empty");
        }
        else{
            while(cur!=null){
                System.out.print(cur.data + " ");
                cur=cur.next;
            }
        }
    }
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        Main obj = new Main();
        int len=ss.nextInt();
        for(int i=1;i<=len;i++){
            obj.insert(ss.nextInt());
        }
        obj.Display();
        int pos = ss.nextInt();
        int ele = ss.nextInt();
        System.out.println();
        obj.specificpos(pos,len,ele);
        obj.Display();
    }
}