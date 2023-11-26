import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.MIN_VALUE, y = Integer.MAX_VALUE;
        int[] a = new int[100];
        int i = 0;
        while(true){
            a[i] = sc.nextInt();
            if(a[i] == 999 || a[i] == -999)
                break;
            if(a[i] > x)
                x = a[i];
            if(a[i] < y)
                y = a[i];
            i++;
        }
        System.out.print(x + " " + y);
    }
}