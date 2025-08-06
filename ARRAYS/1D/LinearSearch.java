import java.util.*;
import java.util.lang;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter element");
            arr[i]=sc.nextInt();
            }
            int target=sc.nextInt();
           LinearSearch(arr, target);
            

    }
    public static void LinearSearch(int arr[],int target){
      boolean flag=false;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            flag=true;
            break;
        }
      }
      if(flag==true){
        System.out.println("Element is present in array");
      }
      else{
        System.out.println("Element is not present in array");
      }
      
    }
}
