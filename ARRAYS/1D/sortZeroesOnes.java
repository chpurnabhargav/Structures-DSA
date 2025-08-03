public class sortZeroesOnes {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,0,0,0,1,0};
        int n=arr.length;
        // int noOfZeroes=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0){
        //         noOfZeroes++;
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     if(i<noOfZeroes){
        //         arr[i]=0;
        //     }
        //     else{
        //         arr[i]=1;
        //     }
        // }
        sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
   public static void sort(int arr[]){
    int start=0;
    int end=arr.length-1;
    while(start< end){
        if(arr[start]==0){
            start++;
        }
       else if(arr[end]==1){
            end--;
        }
       else if(arr[start]==1 && arr[end]==0){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
    }
   }
}
