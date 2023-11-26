import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0, cnt1 = 0;
        for(int i = 0; i < s.length()-1; i++){
            if(s.substring(i,i+2).equals("ee"))
                cnt++;
            if(s.substring(i,i+2).equals("eb"))
                cnt1++;
        }
        System.out.print(cnt + " " + cnt1);
    }
}