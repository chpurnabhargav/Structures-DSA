import java.util.Stack;

public class infixExpression {
    public static void main(String[] args) {
        String str = "1-(     -2)";
        str=str.replaceAll(" ","");
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //for single digit
            if(Character.isDigit(ch)){
                val.push(ch-'0');
            }
            /*
            for multi digit
            if(Character.isDigit(ch)){
                int num=0;
                while(i< str.length() && Character.isDigit(str.charAt(i))){
                    num=num*10+(str.charAt(i)-'0');
                    i++;
                }
                i--;
                val.push(num);
            }
             */
            else if(ch=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(!op.isEmpty() && op.peek()!='('){
                    int b = val.pop();
                    int a = val.pop();
                    char o = op.pop();
                    val.push(cal(a,b,o));
                }
                op.pop(); // pop (
            }
            else{
                while(!op.isEmpty() && op.peek()!='(' && precedence(ch)<=precedence(op.peek())){
                    int b = val.pop();
                    int a = val.pop();
                    char o = op.pop();
                    val.push(cal(a,b,o));
                }
                op.push(ch); // if precedence of peek is not greater
            }
        }
        while(!op.isEmpty()){
            if(val.size()<2) break;
            int b = val.pop();
            int a = val.pop();
            char o = op.pop();
            val.push(cal(a,b,o));
        }

        System.out.println(val.pop());
    }
    public static int precedence(char ch){
        if(ch=='+' || ch=='-') return 1;
        if(ch=='*' || ch=='/') return 2;
        return 0;
    }
    public static int cal(int a,int b,char op){
        int val=0;
        switch(op){
            case '+': val= a+b; break;
            case '-':val= a-b; break;
            case '*':val= a*b; break;
             case '/':val= a/b; break;
        }
        return val;
    }
}
