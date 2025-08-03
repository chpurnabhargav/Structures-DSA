public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k=9;
        int n = arr.length;
        /*
        this is beacuse if k==n the arr comes
        to the original state sp that we can 
        say if k==n k is nothing but 0
        and also any multiple of n in k value 
        will lead to original state 
        suppose n=4 and k=4,8,12,16.. all leads 
        to original state of array
        so if n=5 it can be k=1 so k=k%n;
         */
        k=k%n;
        rotate(arr,0,n-k-1);
        rotate(arr,n-k,n-1);
        rotate(arr,0,n-1);
       for(int ele: arr){
        System.out.print(ele+" ");
       }
        
    }
    public static void rotate(int arr[],int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
