import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int arr = sc.nextInt();
        char b = sc.next().charAt(0);
        int brr = sc.nextInt();
        char c = sc.next().charAt(0);
        int crr = sc.nextInt();
        if(a == 'Y' && arr >= 37)
            if((b == 'Y' && brr >= 37) || (c == 'Y' && crr >= 37))
                System.out.print("E");
            else
                System.out.print("N");
        else
            if((b == 'Y' && brr >= 37) && (c == 'Y' && crr >= 37))
                System.out.print("E");
            else
                System.out.print("N");
    }
}