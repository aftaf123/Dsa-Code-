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
  public   void insert(int key){
        Node sc=new Node(key);
        if(head==null){
            head=sc;
            tail=sc;
        }
        else{
            tail.next=sc;
            tail=sc;
        }
    }
    // public void insertfirst(int val){
    //     Node d=new Node(val);
    //       if(head==null){
    //           head=d;
    //           tail=d;
    //       } 
    //       else{
    //           d.next=head;
    //           head=d;
    //       }
        
    // }
    
    
    
    
    // public void insertlast(int val){
    //     Node cur=head;
    //     Node d=new Node(val);
    //     if(head==null){
    //         head=d;
    //         tail=d;
    //     }
    //     else{
    //         while(cur.next!=null){
    //             cur=cur.next;
    //         }
    //         cur.next=d;
    //         tail=d;
    //     }
    // }
    
    
    
    public int count(){
       int  count = 0;
        Node cur=head;
        if(head==null){
            return 0;
        }
        else{
            while(cur!=null){
                count++;
                cur=cur.next;
            }
        }
        return count;
    }
    
    
    
    
    
 public   void Display(){
        Node cur=head;
        if(head==null){
            System.out.println("empty");
        }
        else{
            while(cur!=null){
                System.out.print(cur.data + " ");
                cur=cur.next;
            }
        }
    }
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
        Main obj=new Main();
        int len=ss.nextInt();
        for(int i=1;i<=len;i++){
            obj.insert(ss.nextInt());
        }
        obj.Display();
        System.out.println();
        // obj.insertfirst(ss.nextInt());
        // obj.Display();
        
    //   obj.insertlast(ss.nextInt());
    //      obj.Display();
        System.out.println(obj.count());
        
    }
}