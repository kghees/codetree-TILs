import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        if(s.length() > s1.length())
            System.out.print(s + " " + s.length());
        else if(s.length() < s1.length())
            System.out.print(s1 + " " + s1.length());
        else
            System.out.print("same");
    }
}