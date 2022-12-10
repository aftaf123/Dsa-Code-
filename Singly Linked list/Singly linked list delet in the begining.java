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

void delf(){
    if(head==null){
        System.out.println("Empty");
    }
    else{
        head = head.next;
    }
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
        
        obj.delf();
        System.out.println();
        obj.Display();
    }
}
