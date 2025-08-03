
import java.util.*;
public class MaxIn2DArray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[4][2];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
			max=Math.max(max, arr[i][j]);
			}
		}

		System.out.print(max);
	}
}
