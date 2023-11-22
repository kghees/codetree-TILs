import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int cnt1 = 0;
        for(int i = 1; i <= 10; i++){
            int a = sc.nextInt();
            if(a % 3 == 0)
                cnt++;
            if(a % 5 == 0)
                cnt1++;
        }
        System.out.print(cnt + " " + cnt1);
    }
}