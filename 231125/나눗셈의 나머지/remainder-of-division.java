import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a > 1){
            arr[a % b]++;
            a /= b;
        }
        for(int i = 0; i < 10; i++){
            sum += arr[i]*arr[i];
        }
        System.out.print(sum);

    }
}