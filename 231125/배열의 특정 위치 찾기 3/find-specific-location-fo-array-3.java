import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int x = 0;
        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                x = i;
                break;
            }
        }
        System.out.print(arr[x-1] + arr[x-2] + arr[x-3]);
    }
}