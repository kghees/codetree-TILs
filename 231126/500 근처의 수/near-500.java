import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int x = 0,y = 1001;
        for(int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
            if(a[i] < 500 && a[i] > x)
                x = a[i];
            if(a[i] > 500 && a[i] < y)
                y = a[i];
        }
        System.out.print(x + " " + y);
    }
}