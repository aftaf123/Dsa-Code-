import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k;
        System.out.println("Enter the length of the arr :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
       
        for(int i=0;i<n-1;i++){
            for(k=0;k<n-i-1;k++){
                if(arr[k]>arr[k+1]){
                    int temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
                
            }
        }
         System.out.println("After swaping :");
         for(int i=0;i<n;i++){
             System.out.print(arr[i] +" ");
         }
    }
}