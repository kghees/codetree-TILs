import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(a[j] - a[i] < res)
                    res = a[j] - a[i];
            }
        }
        System.out.print(res);
    }
}