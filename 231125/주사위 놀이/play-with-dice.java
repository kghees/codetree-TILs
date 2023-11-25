import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            arr[a]++;
        }
        for(int i = 1; i < 7; i++){
            System.out.println(i + " - " + arr[i]);
        }
    }
}