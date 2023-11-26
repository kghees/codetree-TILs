import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[1000];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int x = n;
        while(true){
            int index = 0;
            for(int i = 1; i < x; i++){
                if(a[i] > a[index])
                    index = i;
            }
            System.out.print((index+1) + " ");
            if(index == 0)
                break;
            x = index;
        }
    }
}