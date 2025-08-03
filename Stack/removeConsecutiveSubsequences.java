import java.util.Arrays;
import java.util.Stack;

public class removeConsecutiveSubsequences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,4,4,4,5,7,7,2};
        int[] res = result(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] solve(int[] arr){
        Stack<Integer> st = new Stack<>();
        int temp=Integer.MIN_VALUE;
        for(int ele:arr){
            if(!st.isEmpty() && st.peek()==ele){
                temp=st.pop();
            }
            else{
                if(temp==ele){
                    continue;
                }
                else {
                    st.push(ele);
                }
            }
        }
        int[] res = new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    //method 2 - PW
    public static int[] result(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0;i<arr.length-1;i++){

            if(st.isEmpty() || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(arr[i]==st.peek()){
                if(i==n-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int[] res=new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}
