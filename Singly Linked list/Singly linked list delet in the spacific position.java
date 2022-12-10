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
    
    
    /// delete a specific position
    void delSpe(int len,int pos){
        Node cur = head;
        if(head==null){
            System.out.println("Empty linklist");
        }
        else{
            if(pos==1){
                head = head.next;
            }
            else if(pos>=2 && pos<len){
                for(int i=2;i<pos;i++){
                    cur = cur.next;
                }
                cur.next = cur.next.next;
            }
            else if(pos==len){
                while(cur.next.next!=null){
                    cur = cur.next;
                }
                cur.next = null;
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
        
        
        
        System.out.println();
        int pos = ss.nextInt();
        obj.delSpe(len,pos);
        System.out.println();
        obj.Display();
    }
}