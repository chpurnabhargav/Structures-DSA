import java.util.Scanner;

public class in {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a%2!=0 && b%2!=0 || a==b){
                System.out.println("NO");
            }
            else if((a>b && a%2!=0) || (b>a && b%2!=0)){
                System.out.println("NO");
            }
            else {
                for (int i = 1; i <= Math.max(a, b) / 2; i++) {
                    if(a>b){
                        a=a-2;
                        b=b-1;
                    }
                    else{
                        b=b-2;
                        a=a-1;
                    }
                }
                if((a==0 && b==0) || (a==2 && b==1) || (a==1 && b==2)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}