import java.util.Scanner;
import java.util.Stack;

public class displayStack {

    public static void displayRecuursive(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        displayRecuursive(st);
        System.out.print(top+" ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=5;i++){
            st.add(i);
        }
        System.out.println(st);
        displayRecuursive(st);
    }
}

