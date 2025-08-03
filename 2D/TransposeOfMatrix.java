import java.util.*;

public class TransposeOfMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][3];
        int n = a.length;
        int m = a[0].length;
        int b[][] = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[j][i] = a[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
