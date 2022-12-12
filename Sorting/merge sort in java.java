 import java.util.Scanner;
 public class Main{
     public void merge1(int a[],int start,int mid,int end){
         int l=mid-start+1;
         int r=end-mid;
         int left_subarray[]=new int[l];
         int right_subarray[]=new int[r];
         
         for(int i=0;i<l;++i)
             left_subarray[i]=a[start+i];
         
         for(int j=0;j<r;++j)
             right_subarray[j]=a[mid+1+j];
         
         
         int i=0;
         int j=0;
         int k=start;
         while(i<l && j<r){
             if(left_subarray[i]<=right_subarray[j]){
                 a[k]=left_subarray[i];
                 i++;
             }
             else{
                 a[k]=right_subarray[j];
                 j++;
             }
             k++;
         }
         while(i<l){
             a[k]=left_subarray[i];
             i++;
             k++;
         }
         while(j<r){
             a[k]=right_subarray[j];
             j++;
             k++;
         }
     }
     public void mergesort(int a[],int start,int end){
         if(start<end){
             int mid=(start+end)/2;
             
             mergesort(a,start,mid);
             mergesort(a,mid+1,end);
             merge1(a,start,mid,end);
         }
     }
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         Main m=new Main();
         System.out.println("Enter length :");
         int n=sc.nextInt();
         int arr[]=new int[n];
         System.out.println("enter elements :");
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         m.mergesort(arr,0,n-1);
         System.out.println("after sorting :");
         for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
     }
 }