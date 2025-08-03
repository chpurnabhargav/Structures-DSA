import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            
            arr[i]=sc.nextInt();
            }
            System.out.println("max element in array is: "+MaxElement(arr));
       System.out.println(MathMax(arr));

    }
    public static int MaxElement(int arr[]){
        int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
    }
    public static int MathMax(int arr[]){
        int mx=0;
        for(int i=0;i<arr.length;i++){
            mx=Math.max(mx,arr[i]);
        }
        return mx;
    }
}
