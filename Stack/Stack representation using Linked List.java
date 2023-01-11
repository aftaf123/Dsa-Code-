import java.util.Scanner;
class Stack{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top=null;
    public void push(Scanner sc){
        System.out.println("Enter the data :");
        int data=sc.nextInt();
        Node new_node =new Node(data);
        if(top==null){
            top=new_node;
        }
        else{
            new_node.next=top;
            top=new_node;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("Stack is empty :");
        }
        else{
            top=top.next;
        }
    }
    
    public void display(){
        Node curr=top;
         if(curr==null){
            System.out.println("Overflow !!");
        }
        else{
        while(curr!=null){
            System.out.println(curr.data );
            curr=curr.next;
        }
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        int choice=0;
        while(choice!=4){
            System.out.println("Enter any one choice :");
            System.out.println("\n1.push\n2.pop\n3.display\n4.exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:{
                    s.push(sc);
                    break;
                }
                case 2:{
                    s.pop();
                    break;
                }
                
                case 3:{
                    s.display();
                    break;
                }
                case 4:{
                    System.out.println("You are now exit ------>");
                    System.exit(0);
                    break;
                }
                default :{
                    System.out.println("enter the valid choice :");
                }
            };
        }
    }
}

