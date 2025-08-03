import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;

public class deQueue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addFirst(2);
        dq.addLast(1);
        dq.addFirst(2);
        dq.addFirst(1);
        dq.addFirst(2);
        System.out.println(dq);
        dq.removeFirstOccurrence(1);
        System.out.println(dq);
        dq.removeLastOccurrence(2);
        System.out.println(dq);
    }
}
