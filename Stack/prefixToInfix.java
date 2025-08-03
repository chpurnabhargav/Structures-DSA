import java.util.Stack;

public class prefixToInfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                val.push(""+ch);
            }
            else{
                String val1=val.pop();
                String val2=val.pop();
                val.push(val1+ch+val2);
            }
        }
        System.out.println(val.pop());
    }
}
