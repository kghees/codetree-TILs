import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = Integer.MAX_VALUE, y = Integer.MIN_VALUE;
        int cnt = 0, cnt1 = 0;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(a[i] < x)
                x = a[i];
            if(a[i] > y)
                y = a[i];
        }
        for(int i = 0; i < n; i++){
            if(a[i] == x)
                cnt++;
            if(a[i] == y)
                cnt1++;
        }
        System.out.print(x + " " + cnt);
    }
}