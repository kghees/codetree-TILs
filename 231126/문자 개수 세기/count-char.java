import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a = sc.next().charAt(0);
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == a)
                cnt++;
        }
        System.out.print(cnt);
    }
}