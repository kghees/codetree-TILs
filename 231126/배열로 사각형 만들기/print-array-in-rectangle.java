import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[5][5];
        for(int i = 0; i < 5; i++){
            a[0][i] = 1;
            a[i][0] = 1;
        }
        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 5; j++){
                a[i][j] = a[i-1][j] + a[i][j-1];
            }
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}