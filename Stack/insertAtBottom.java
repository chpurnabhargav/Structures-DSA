import java.util.Scanner;
import java.util.Stack;

public class insertAtBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        System.out.println("enter the elements");
        for(int i=1;i<=n;i++){
            st.add(sc.nextInt());
        }
        System.out.println("Enter the element to be inserted at last");
        int x = sc.nextInt();
        Stack<Integer> rv = new Stack<>();
        while(st.size()!=1){
            rv.add(st.pop());
        }
        st.add(x);
        while(rv.size()!=0){
            st.add(rv.pop());
        }
        System.out.println(st);
    }
}
