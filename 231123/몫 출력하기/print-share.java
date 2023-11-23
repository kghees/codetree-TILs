import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (true) {
            int n =sc.nextInt();
            if(n % 2 == 1){
                continue;
            }
            else{
                System.out.println(n / 2);
                i++;
            }
            if(i == 3){
                break;
            }
        }
    }
}