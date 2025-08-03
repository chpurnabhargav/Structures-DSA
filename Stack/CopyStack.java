import java.util.*;
public class CopyStack {
    public static void main(String[] args) {
        //copy contents from one stack to another

        //approach - using 3 stacks 
        Stack<Integer> s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        Stack<Integer> s2 = new Stack<>();
        System.out.println(s1);
        while(s1.size()!=0){
            s2.push(s1.pop());
        }
        System.out.println(s2);
        Stack<Integer> reverse = new Stack<>();
        while(s2.size()!=0){
            reverse.push(s2.pop());
        }
        System.out.println(reverse);
    }
}
