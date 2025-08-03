import java.util.*;
public class RotateArray {
public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
      int arr[][] = new int[2][3];
      int n = arr.length;
      for(int i=0;i<n;i++) {
    	  for(int j=0;j<i;j++) {
    		  int temp=arr[i][j];
    		  arr[i][j]=arr[j][i];
    		  arr[j][i]=temp;
    	  }
      }
      print(arr);
      for(int i=0;i<n;i++) {
    	  int a=0,m=n-1;
    	  while(a<m) {
    		  int temp=arr[i][a];
    		  arr[i][a]=arr[i][b];
    		  arr[i][b]=temp;
    		  a++;
    		  m--;
    	  }
      }
      
}
}
