import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int x = Integer.MAX_VALUE;
        int res = 0;
        for(int i = 0; i < n; i++){
            if(x > a[i])
                x = a[i];
            for(int j = i; j < n; j++){
                if(a[j] > x){
                    if(res < a[j] - x)
                        res = a[j] - x;
                }
            }
        }
        System.out.print(res);
    }
}