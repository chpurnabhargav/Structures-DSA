import java.util.Stack;

public class postFixEvaluation {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                val.push(ch-'0');
            }
            else {
                    if (val.size() < 2) break;
                    int val2 = val.pop();
                    int val1 = val.pop();
                    val.push(cal(val1, val2, ch));
            }
        }
        System.out.println(val);

    }
    public static int precedence(char ch){
        if(ch=='+' || ch=='-') return 0;
        if(ch=='*' || ch=='/') return 1;
        return 0;
    }
    public static int cal(int a,int b,char op){
        int val = 0;
        switch (op){
            case '+':val=a+b;break;
            case '-':val=a-b;break;
            case '*':val=a*b;break;
            case '/':val=a/b;break;
        }
        return val;
    }
}
