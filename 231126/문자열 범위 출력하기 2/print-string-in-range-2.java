import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int n = sc.nextInt();
        if(a.length() <= n){
            for(int i = a.length()-1; i >= 0; i--){
                System.out.print(a.charAt(i));
            }
        }
        else{
            for(int i = (a.length()-1); i >= (a.length()-n); i--){
                System.out.print(a.charAt(i));
            }
        }
    }
}