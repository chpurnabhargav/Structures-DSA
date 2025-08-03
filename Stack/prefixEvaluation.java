import java.util.Stack;

public class prefixEvaluation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                val.push(ch-'0');
            }
            else{
                int val2=val.pop();
                int val1=val.pop();
                val.push(calci(val2,val1,ch));
                // as we are coming from back take in reverse order
            }
        }
        System.out.println(val.peek());
        
    }
    public  static int calci(int a,int b, char op){
        int val = 0;
        switch (op){
            case '+':val=a+b; break;
            case '-':val=a-b; break;
            case '/':val=a/b; break;
            case '*':val=a*b; break;            
        }
        return val;
    }
}
