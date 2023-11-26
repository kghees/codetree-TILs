import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = a.length()-1; i >= 0; i--){
            if(i % 2 == 1)
                System.out.print(a.charAt(i));
        }
    }
}