import java.util.Scanner;
import java.util.Stack;

public class removeFromAnyIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("enter size: ");
        int n = sc.nextInt();
        System.out.println("enter elements: ");
        for(int i=1;i<=n;i++){
            st.push(sc.nextInt());
        }
        System.out.println(st);
        System.out.println("enter index to be removed: ");
        int removed = sc.nextInt();
        Stack<Integer> store = new Stack<>();
        int i=1;
        while(i!=removed-1){
            store.push(st.pop());
        }
        st.pop();
        while(store.size()!=0){
            st.push(store.pop());
        }
        System.out.println(st);
    }
}
