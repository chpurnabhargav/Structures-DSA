public class MatrixSpiral {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int m=arr[0].length;
        int minRow=0,maxRow=n-1;
        int minCol=0,maxCol=m-1;
        while(minRow<=maxRow && minCol<=maxRow){
            for(int i=minCol;i<=maxCol;i++){
                System.out.print(arr[minRow][i]+" ");
            }
            minRow++;
           if(minRow>maxRow || minCol>maxCol){
            break;
           }
            for(int i=minRow;i<=maxRow;i++){
                System.out.print(arr[i][maxCol]+" ");
            }
            if(minRow>maxRow || minCol>maxCol){
                break;
            }
            maxCol--; 
            for(int i=maxCol;i>=minCol;i--){
                System.out.print(arr[maxRow][i]+" ");
            }
            if(minRow>maxRow || minCol>maxCol){
                break;
            }
            maxRow--;
            for(int i=maxRow;i>=minRow;i--){
                System.out.print(arr[i][minCol]+" ");
            }
            minCol++;
           
        }
    }
}
