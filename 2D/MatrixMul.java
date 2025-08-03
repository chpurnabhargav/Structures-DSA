public class MatrixMul {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5,6}};
        int[][] B = {{7, 8}, {9, 10}, {11,12}};
        if(A[0].length!=B.length){
            System.out.println("Matrix A and B cannot be multiplied");
        }
        else{
            int C[][]=new int[A.length][B[0].length];
            for(int i=0;i<C.length;i++){
                for(int j=0;j<C[0].length;j++){
                    for(int k=0;k<B.length;k++){
                        C[i][j]+=A[i][k]*B[k][j]; 
                    }
                }
            }
            for(int i=0;i<C.length;i++){
                for(int j=0;j<C[0].length;j++){
                    System.out.print(C[i][j]+" ");
                }
            }
        }
        
    }
}
