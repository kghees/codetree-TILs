import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = sc.nextInt();
        arr[0] = 1;
        arr[1] = 5;
        int cnt = 2;
        for(int i = 2; i < 10; i++){
            arr[i] = arr[i-1] + arr[i-2];
            cnt++;
            if(arr[i] >= 100)
                break;
        }
        for(int i = 0; i < cnt; i++){
            System.out.print(arr[i] + " ");
        }
    }
}