import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[100];
        int[] b = new int[100];
        boolean check = false;
        for(int i = 0; i < n1; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++){
            b[i] = sc.nextInt();
        }
        for(int i = 0; i < n1-n2+1; i++){
            for(int j = 0; j < 1; j++){
                if(a[i] == b[j] && a[i+1] == b[j+1])
                    check = true;
            }
        }
        if(check == true)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}