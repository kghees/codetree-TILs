import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        String s2 = sc.next();
        int x = s.length();
        int y = s1.length();
        int z = s2.length();
        int max = x;
        if(max < y) max = y;
        if(max < z) max = z;
        int min = x;
        if(min > y) min = y;
        if(min > z) min = z;
        System.out.print(max - min);
    }
}