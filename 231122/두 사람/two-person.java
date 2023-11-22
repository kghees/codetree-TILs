import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        char d = sc.next().charAt(0);
        if((a >= 19 && b =='M') || (c >= 19 && d == 'M'))
            System.out.print(1);
        else
            System.out.print(0);
    }
}