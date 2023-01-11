//// create a stack using array

// create a stack
import java.util.Scanner;
class Mystack{
    int size;
    int top;
    int[] li;
    Mystack(int size){
        this.size = size;
        li = new int[size];
        top = -1;
    }
    // check stack is Empty or not
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    // check stack is full or not
    public boolean isFull(){
        if(top==size-1){
            return true;
        }
        else{
            return false;
        }
    }
    // insert or push element in stack
    public void push(int data){
        if(isFull()){
            System.out.println("The stack is overflow");
        }
       else{
           top++;
           li[top] = data;
       }
    }
    // pop element in stack function
    public void pop(){
        if(isEmpty()){
            System.out.println("The stack is underflow");
        }
        else{
            top--;
        }
    }
    // peek top data in stack
    public void peek(){
       
        if(isEmpty()){
            System.out.println("The stack is Empty");
        }
        else{
            System.out.println("top element of the stack: " +li[top]+" ");
        }
    }
    // display the stack element
    public void display(){
    int cur = top;
    if(isEmpty()){
        System.out.println("The stack is Empty");
    }
    else{
        while(cur>=0){
            System.out.print(li[cur]+" ");
            cur--;
        }
    }
}
//reverse stack
void rev(){
    int cur = top;
    String str = "";
    if(isEmpty())
    {
       System.out.println("Empty stack"); 
    }
    else{
        while(cur>=0){
            str = li[cur]+" "+str;
            cur--;
        }
    }
    System.out.print(str);
}
}

public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in); 
       int size = sc.nextInt();
       Mystack obj = new Mystack(size);
       obj.push(12);
       obj.push(14);
       obj.push(15);
       obj.push(18);
       obj.push(18);
     
       obj.display();
       System.out.println();
       obj.rev();
    }
}