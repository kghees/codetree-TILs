import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if(m >= 3 && m <= 5)
            System.out.print("Spring");
        else if(m <= 8 && m >= 6)
            System.out.print("Summer");
        else if(m <= 11 && m >= 9)
            System.out.print("Fall");
        else
            System.out.print("Winter");
    }
}