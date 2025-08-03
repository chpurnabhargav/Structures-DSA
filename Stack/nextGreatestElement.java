import java.util.Arrays;
import java.util.Stack;

public class nextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 1, 6, 3, 4};
        int[] res = solve(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] solve(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        res[arr.length - 1] = -1;
        st.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }

        return res;
    }
}
