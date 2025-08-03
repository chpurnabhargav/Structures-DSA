import java.util.Scanner;
import java.util.Stack;

public class minimumNoOfBracketsRemoved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isBalanced(str));

    }
    public static int isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n  = str.length();
        int unMatchedRight=0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push('(');
            }
            else{
                if( !st.isEmpty() && st.peek()=='(') st.pop();
                else unMatchedRight++;
            }
        }
        int unMatchedLeft=st.size();
        return unMatchedLeft+unMatchedRight;
    }
}
