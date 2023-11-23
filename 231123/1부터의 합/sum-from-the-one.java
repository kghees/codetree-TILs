import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
            if(sum >= n){
                cnt = i;
                break;
            }
        }
        System.out.print(cnt);
    }
}