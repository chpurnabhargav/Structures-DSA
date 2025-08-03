import java.util.PriorityQueue;
public class BasicHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println(pq);
        pq.add(2);
        System.out.println(pq);
        pq.add(10);
        System.out.println(pq);
        pq.add(0);
        System.out.println(pq);
        pq.remove(0);
        System.out.println(pq);
    }
}
