import javax.print.CancelablePrintJob;
import java.util.Stack;

public class postfixToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                val.push(""+ch);
            }
            else{
                String val2 = val.pop();
                String val1 = val.pop();
                val.push(val1+ch+val2);
            }
        }
        System.out.println(val.pop());
    }
}
