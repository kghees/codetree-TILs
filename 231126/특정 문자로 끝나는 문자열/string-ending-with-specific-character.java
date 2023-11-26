import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[10];
        int cnt = 0;
        for(int i = 0; i < 10; i++)
            a[i] = sc.next();
        char s = sc.next().charAt(0);
        for(int i = 0; i < 10; i++){
            int x = a[i].length();
            if(a[i].charAt(x-1) == s){
                cnt++;
                System.out.println(a[i]);
            }
        }
        if(cnt == 0)
            System.out.print("None");
    }
}