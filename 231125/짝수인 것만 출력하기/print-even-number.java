import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];
        int cnt = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0)
                ans[cnt++] = arr[i];
        }
        for(int i = 0; i < cnt; i++){
            System.out.print(ans[i] + " ");
        }
    }
}