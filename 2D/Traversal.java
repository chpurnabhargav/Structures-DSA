import java.util.Scanner;
class Traversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int arr[][]=new int[3][3];
        int n=arr.length;
        int m=arr[0].length;
        System.out.println(n);
        System.out.print(m);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } 
        for(int[] ele:arr){
            for(int ele2:ele){
                System.out.print(ele2+" ");
            }
            System.out.println();
        }
    }
}
