import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][4];
        int sum = 0;
        for(int i = 0; i < 2; i++)
            for(int j = 0; j < 4; j++)
                a[i][j] = sc.nextInt();
        for(int i = 0; i < 2; i++){
            int row = 0;
            for(int j = 0; j < 4; j++){
                row += a[i][j];
                sum += a[i][j];
            }
            System.out.printf("%.1f ", (double)row / 4);
        }
        System.out.println();
        for(int i = 0; i < 4; i++){
            int col = 0;
            for(int j = 0; j < 2; j++){
                col += a[j][i];
            }
            System.out.printf("%.1f ", (double)col / 2);
        }
        System.out.println();
        System.out.printf("%.1f", (double)sum / 8);
    }
}