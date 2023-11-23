import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        for(int i = 1; i <= 5; i++){
            int a = sc.nextInt();
            if(a % 3 != 0)
                check = false;
        }
        if(check == true)
            System.out.print(1);
        else
            System.out.print(0);
    }
}