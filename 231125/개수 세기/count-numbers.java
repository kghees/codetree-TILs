import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a == m)
                cnt++;
        }
        System.out.print(cnt);
    }
}