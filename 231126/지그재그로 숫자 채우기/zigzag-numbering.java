import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int x = 0;
        for(int i = 0; i < m; i++){
            if(i % 2 == 0){
                for(int j = 0; j < n; j++){
                    a[j][i] = x;
                    x += 1;
                }
            }
            else{
                for(int j = 0; j < n; j++){
                    a[n-j-1][i] = x;
                    x += 1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}