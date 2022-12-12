public class Main{
    public static void binarySearch(int arr[] ,int first,int last,int key){
          int mid=(first+last)/2;
           int res=-1;
        while(first<=last){
         
          
            if(arr[mid]<key){
                first=mid+1;
            }
            else if(arr[mid]==key){
             res=mid;
             first=mid+1;
           
            }
            
            else{
                last=mid-1;
            }
          mid=(first+last)/2;
          
        }
        System.out.println("element is fount at index: "+ res);
         
        
    }
    public static void main(String[] args){
        int arr[]={10,11,12,30,30,30,30,30,39,40,50};
        int key=30;
        int n=arr.length-1;
        binarySearch(arr,0,n,key);
        
    }
}