import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        String str=sc.next();
        System.out.println(isBalanced(str));
    }
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n  = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push('(');
            }
            else{
                if(st.size()==0) return false;
                if(st.peek()=='(') st.pop();
            }
        }
        return st.size()==0;
    }
}
