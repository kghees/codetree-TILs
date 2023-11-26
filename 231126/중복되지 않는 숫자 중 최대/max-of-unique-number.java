import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int max = -1;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            int x = a[i];
            if(max < x){
                int cnt = 0;
                for(int j = 0; j < n; j++){
                    if(a[j] == x){
                        cnt ++;
                    }
                }
                if(cnt == 1){
                    max = x;
                }
            }
        }
        System.out.print(max);
    }
}