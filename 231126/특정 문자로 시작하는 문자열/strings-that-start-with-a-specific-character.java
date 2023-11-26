import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        int sum = 0, cnt = 0;
        for(int i = 0; i < n; i++)
            a[i] = sc.next();
        char s = sc.next().charAt(0);
        for(int i = 0; i < n; i++){
            if(a[i].charAt(0) == s){
                cnt++;
                sum += a[i].length();
            }
        }
        System.out.printf("%d %.2f", cnt, (double)sum / cnt);
    }
}