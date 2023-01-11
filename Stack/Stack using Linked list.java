// create a stack using linklist
import java.util.*;
class Stack{
    Node top;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data= data;
        }
    }
    //check stack is full or not
    public boolean isFull(){
        return false;
    }
    // check stack is empty or not
    public boolean isEmpty()
    {
        return top==null;
        
    }
    // insert data in stack
    public void push(int data)
    {
        Node obj = new Node(data);
        if(isEmpty())
        {
            top = obj;
        }
        else{
            obj.next = top;
            top = obj;
        }
    }
    // delete data in stack
    public int pop(){
        if(!isEmpty())
        {
            int temp = top.data;
            top = top.next;
            return temp;
        }
        return Integer.MIN_VALUE;
    }
    // peek data in stack
    public int peek(){
        if(!isEmpty())
        {
            int temp = top.data;
            return temp;
        }
        return Integer.MIN_VALUE;
    }
    // display function 
    public void display(){
        if(top==null)
            return;
        Node current = top;
        while(current.next != null)
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println(current.data);
    }
}
public class Main{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack st = new Stack();
        for(int i = 0; i<n; i++)
        {
            st.push(sc.nextInt());
        }
        st.display();
    }
}