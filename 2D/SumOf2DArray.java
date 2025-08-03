import java.util.*;
public class SumOf2DArray {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][3];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	int sum=0;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			sum=sum+arr[i][j];
		}
	}
	
	System.out.print(sum);
}
}
