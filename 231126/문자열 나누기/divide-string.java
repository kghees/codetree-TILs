import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        for(int i = 0; i < n; i++){
            String a = sc.next();
            s += a;
        }
        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i));
            if((i+1) % 5 == 0)
                System.out.println();
        }
    }
}