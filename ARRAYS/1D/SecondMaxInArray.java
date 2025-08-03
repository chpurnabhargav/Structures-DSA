import java.util.Scanner;

public class SecondMaxInArray {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            }
        
       System.out.println(SecondMathMax(arr));

    }
    public static int SecondMathMax(int arr[]){
        int mx=Integer.MIN_VALUE;
        int smx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            mx=Math.max(mx,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=mx){
                smx=Math.max(smx,arr[i]);
            }
        }
        return smx;
    }
}
