import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean check = true;
        for(int i = a; i <= b; i++){
            if(i % c == 0)
                check = false;
        }
        if(check == true)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}