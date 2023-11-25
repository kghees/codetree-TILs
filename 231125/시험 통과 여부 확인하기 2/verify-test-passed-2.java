import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int[] arr = new int[4];
            int sum = 0;
            for(int j = 0; j < n; j++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            double avg = (double)sum / 4;
            if(avg >= 60){
                System.out.println("pass");
                cnt++;
            }
            else
                System.out.println("fail");
        }
        System.out.print(cnt);
    }
}