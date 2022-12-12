import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int min;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your elements before sorting :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println();
        System.out.println("After sorting :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}