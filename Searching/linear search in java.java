import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,n,item;
        int count=0;
        System.out.println("How many element you want to enter");
          n=sc.nextInt();
        int a[]=new int[n];
      System.out.println("Enter elements: ");
      for( i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
          System.out.println("Enter item to find: ");
      
          item=sc.nextInt();
          for(  i=0;i<a.length;i++){
              if(a[i]==item){
                  count++;
                  break;
              }
          }
          if(count>0)
          {
              System.out.println("Item exits at "+ i);
          }
          else
              System.out.println("Item doen not exit");
          
      
        
    }
}