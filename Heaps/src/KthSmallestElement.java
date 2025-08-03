import java.util.*;
public class KthSmallestElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int arr[]={7, 10, 4, 3, 20, 15};
        int k = 3;
        for(int ele:arr){
            pq.add(ele);
        }
        for(int i=1;i<k;i++){
            pq.remove();
        }
        System.out.println(pq.peek());
    }
}
