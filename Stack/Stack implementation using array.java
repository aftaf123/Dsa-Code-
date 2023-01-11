import java.util.Scanner;  
class Stack   
{  
    int top;   
    int maxsize; 
    int arr[];
    Stack(int size){
     
     this.maxsize=size;   
     arr = new int[maxsize];  
     top=-1;
    }
      
    boolean isEmpty()  
    {  
        return (top < 0);  
    }  
   
    boolean push (Scanner sc)  
    {  
        if(top == maxsize-1)  
        {  
            System.out.println("Overflow !!");  
            return false;  
        }  
        else   
        {  
            System.out.println("Enter Value");  
            int val = sc.nextInt();  
            top++;  
            arr[top]=val;  
            System.out.println("Item pushed");  
            return true;  
        }  
    }  
    boolean pop ()  
    {  
        if (top == -1)  
        {  
            System.out.println("Underflow !!");  
            return false;  
        }  
        else   
        {  
            top --;   
            System.out.println("Item popped");  
            return true;  
        }  
    }  
    
    
     int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = arr[top];
            return x;
        }
    }
    
    
    
    void display ()  
    {  
        System.out.println("Printing stack elements .....");  
      
      if(top==-1){
          System.out.println("Stack is empty!!!");
      }
      else{
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(arr[i]);  
        }  
      }
    }  
}  
public class Main {  
public static void main(String[] args) {  
    int choice=0;  
    Scanner sc = new Scanner(System.in);  
    
   System.out.println("Enter the max size: ");
     int maxsize=sc.nextInt();
     Stack s = new Stack(maxsize);  
    while(choice != 5)  
    {  
        System.out.println("Chose one from the below options...\n");  
        System.out.println("\n1.Push\n2.Pop\n3.Show\n4.peek\n5.Exit");  
        System.out.println("\n Enter your choice \n");        
        choice = sc.nextInt();  
        switch(choice)  
        {  
            case 1:  
            {   
                s.push(sc);  
                break;  
            }  
            case 2:  
            {  
                s.pop();  
                break;  
            }  
            case 3:  
            {  
                s.display();  
                break;  
            }  
            case 4:{
                System.out.println("The top element is :" +      s.peek());
                
             System.out.println();
             break;
            }
            case 5:   
            {  
                System.out.println("Exiting....");  
                System.exit(0);  
                break;   
            }  
            default:  
            {  
                System.out.println("Please Enter valid choice ");  
            }   
        };  
    }  
}  
}  