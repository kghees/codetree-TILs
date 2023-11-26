import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100];
        int cnt = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(a[i] == 2)
                cnt++;
            if(cnt == 3){
                System.out.print(i+1);
                break;
            }
        }
    }
}