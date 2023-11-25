import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] arr = new char[]{'L','E','B','R','O','S'};
        char s = sc.next().charAt(0);
        int x = -1;
        for(int i = 0; i < 6; i++){
            if(arr[i] == s){
                x = i;
            }
        }
        if(x == -1)
            System.out.print("None");
        else
            System.out.print(x);
    }
}