import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = false;
        for(int i = 2; i <= n-1; i++){
            if(n % i == 0){
                check = true;
            }
        }
        if(check == true)
            System.out.print("C");
        else
            System.out.print("N");
    }
}