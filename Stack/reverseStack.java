import java.util.Scanner;
import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> st = new Stack<>();
    for(int i=1;i<=5;i++){
        st.push(i);
    }
        System.out.println(st);
    reverse(st);
        System.out.println(st);
    }
    public static void  insertAtBottom(Stack<Integer> st,int ele) {
        Stack<Integer> store = new Stack<>();
        while (st.size() != 0) {
            store.push(st.pop());
        }
        st.push(ele);
        while (store.size() != 0) {
            st.push(store.pop());
        }
    }
    public static void reverse(Stack<Integer> st){
     if(st.size()==1) return;
     int top = st.pop();
     reverse(st);
     insertAtBottom(st,top);
    }
}
