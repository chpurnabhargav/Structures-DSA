import java.util.*;
public class basicset{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(-10);
        set.add(-8);
        set.add(20);
        //add elements
        set.add(200);
        System.out.println(set);
        //searching
        System.out.println(set.contains(100));
        //remove element
        set.remove(-10);
        Object arr[] = set.toArray();
    }
}