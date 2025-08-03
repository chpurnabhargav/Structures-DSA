import java.util.Collection;
import java.util.Collections;
import  java.util.PriorityQueue;
public class MaxHeap {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(1);
        System.out.println(pq);
        pq.add(2);
        System.out.println(pq);
        pq.add(7);
        System.out.println(pq);
        pq.add(3);
        System.out.println(pq);
    }
}
