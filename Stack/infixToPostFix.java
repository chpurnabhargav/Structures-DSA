import java.util.Stack;

public class infixToPostFix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch  = str.charAt(i);
            if(Character.isDigit(ch)){
                String s = ""+ch;
                val.push(s);
            }
            else if(ch=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(!op.isEmpty() && op.peek()!='('){
                    String s2 = val.pop();
                    String s1 = val.pop();
                    char o = op.pop();
                    String ans=""+s1+s2+o;
                    val.push(ans);
                }
                op.pop();
            }
            else {
                while(!op.isEmpty() && op.peek()!='(' && precedence(ch)<=precedence(op.peek())){
                    String s2 = val.pop();
                    String s1 = val.pop();
                    char o = op.pop();
                    String ans=""+s1+s2+o;
                    val.push(ans);
                }
                op.push(ch);
            }
        }
        while(!op.isEmpty()){
            if(val.size()<2) break;
            String s2 = val.pop();
            String s1 = val.pop();
            char o = op.pop();
            String ans=""+s1+s2+o;
            val.push(ans);
        }
        System.out.println(val.peek());
    }
    public static int precedence(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }
        if(ch=='*' || ch=='/'){
            return 2;
        }
        return 0;
    }
}
