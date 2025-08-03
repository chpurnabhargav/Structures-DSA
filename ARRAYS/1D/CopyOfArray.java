import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int arr2[]=Arrays.copyOf(arr, arr.length);
        for(int ele:arr2){
            System.out.println(ele);
        }
        System.out.println(Arrays.compare(arr,arr2));
    }
}
