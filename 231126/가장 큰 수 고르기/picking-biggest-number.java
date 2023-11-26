import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int max = 0;
        for(int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.print(max);
    }
}