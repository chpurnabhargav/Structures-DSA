import java.util.Stack;

public class prefixToPostFix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                String s=""+ch;
                val.push(s);
            }
            else{
                    String val1 = val.pop();
                    String val2 = val.pop();
                    String sr = "" + val1 + val2 +ch;
                    val.push(sr);

            }
        }
        System.out.println(val);
    }
}
