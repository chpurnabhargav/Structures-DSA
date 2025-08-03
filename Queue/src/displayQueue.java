import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.print(q);
        Queue<Integer> helper = new ArrayDeque<>();
        while(q.size()!=0){
            int val=q.remove();
            System.out.print(val+" ");
            helper.add(val);
        }
        while(helper.size()!=0){
            q.add(helper.remove());
        }
        // 1 2 3 4 5
    }
}
