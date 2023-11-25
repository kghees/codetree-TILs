import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0, sum1 = 0;
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 0){
                sum += arr[i];
            }
            else
                sum1 += arr[i];
        }
        if(sum > sum1)
            System.out.print(sum - sum1);
        else
            System.out.print(sum1 - sum);
    }
}