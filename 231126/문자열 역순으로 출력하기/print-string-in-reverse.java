import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[4];
        for(int i = 0; i < 4; i++)
            a[i] = sc.next();
        for(int i = 3; i >= 0; i--)
            System.out.println(a[i]);
    }
}