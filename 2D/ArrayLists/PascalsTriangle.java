package ArrayLists;
import java.util.*;
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> rows=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    rows.add(1);
                }
                else{
                    rows.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(rows);
        }
        System.out.println(ans);
    }
}
