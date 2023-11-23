import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int i = 1;
        while(n >= 1){
            n /= i;
            i++;
            cnt++;
        }
        System.out.print(cnt);
    }
}