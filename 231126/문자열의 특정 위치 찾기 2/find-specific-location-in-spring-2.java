import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        char s = sc.next().charAt(0);
        int cnt = 0;
        for(int i = 0; i < 5; i++){
            if(a[i].charAt(2) == s || a[i].charAt(3) == s){
                System.out.println(a[i]);
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}