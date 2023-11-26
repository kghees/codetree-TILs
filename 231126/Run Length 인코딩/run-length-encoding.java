import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String ans = "";
        char s = a.charAt(0);
        int cnt = 1;
        for(int i = 1; i < a.length(); i++){
            if(a.charAt(i) == s){
                cnt++;
            }
            else{
                ans += s;
                ans += Integer.toString(cnt);
                s = a.charAt(i);
                cnt = 1;
            }
        }
        ans += s;
        ans += Integer.toString(cnt);
        System.out.print(ans.length() + "\n" + ans);
    }
}